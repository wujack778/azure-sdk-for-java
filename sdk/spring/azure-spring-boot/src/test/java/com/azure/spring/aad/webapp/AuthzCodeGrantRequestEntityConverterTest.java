// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.spring.aad.webapp;

import org.hamcrest.Matcher;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.FilteredClassLoader;
import org.springframework.boot.test.context.assertj.AssertableWebApplicationContext;
import org.springframework.boot.test.context.runner.WebApplicationContextRunner;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.RequestEntity;
import org.springframework.security.oauth2.client.endpoint.OAuth2AuthorizationCodeGrantRequest;
import org.springframework.security.oauth2.client.registration.ClientRegistration;
import org.springframework.security.oauth2.core.endpoint.OAuth2AuthorizationExchange;
import org.springframework.security.oauth2.core.endpoint.OAuth2AuthorizationRequest;
import org.springframework.security.oauth2.core.endpoint.OAuth2AuthorizationResponse;
import org.springframework.security.oauth2.server.resource.BearerTokenAuthenticationToken;
import org.springframework.util.MultiValueMap;

import java.util.Optional;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AuthzCodeGrantRequestEntityConverterTest {

    private AADWebAppClientRegistrationRepository clientRepo;
    private ClientRegistration azure;
    private ClientRegistration arm;

    private final WebApplicationContextRunner contextRunner = new WebApplicationContextRunner()
        .withClassLoader(new FilteredClassLoader(BearerTokenAuthenticationToken.class))
        .withUserConfiguration(AADWebAppConfiguration.class)
        .withPropertyValues("azure.activedirectory.authorization-server-uri = fake-uri",
            "azure.activedirectory.authorization.arm.scopes = Calendars.Read",
            "azure.activedirectory.authorization.arm.on-demand=true",
            "azure.activedirectory.client-id = fake-client-id",
            "azure.activedirectory.client-secret = fake-client-secret",
            "azure.activedirectory.tenant-id = fake-tenant-id",
            "azure.activedirectory.user-group.allowed-groups = group1, group2");

    private void getBeans(AssertableWebApplicationContext context) {
        clientRepo = context.getBean(AADWebAppClientRegistrationRepository.class);
        azure = clientRepo.findByRegistrationId("azure");
        arm = clientRepo.findByRegistrationId("arm");
    }

    @Test
    public void addScopeForDefaultClient() {
        contextRunner.run(context -> {
            getBeans(context);
            MultiValueMap<String, String> body = convertedBodyOf(createCodeGrantRequest(azure));
            assertEquals(
                "openid profile offline_access https://graph.microsoft.com/User.Read",
                body.getFirst("scope")
            );
        });
    }

    @Test
    public void addScopeForOnDemandClient() {
        contextRunner.run(context -> {
            getBeans(context);
            MultiValueMap<String, String> body = convertedBodyOf(createCodeGrantRequest(arm));
            assertEquals("Calendars.Read openid profile", body.getFirst("scope"));
        });
    }

    @Test
    @SuppressWarnings("unchecked")
    public void addHeadersForDefaultClient() {
        contextRunner.run(context -> {
            getBeans(context);
            HttpHeaders httpHeaders = convertedHeaderOf(createCodeGrantRequest(azure));
            assertThat(httpHeaders.entrySet(), (Matcher) hasItems(expectedHeaders()));
        });
    }

    @Test
    @SuppressWarnings("unchecked")
    public void addHeadersForOnDemandClient() {
        contextRunner.run(context -> {
            getBeans(context);
            HttpHeaders httpHeaders = convertedHeaderOf(createCodeGrantRequest(arm));
            assertThat(httpHeaders.entrySet(), (Matcher) hasItems(expectedHeaders()));
        });
    }

    private HttpHeaders convertedHeaderOf(OAuth2AuthorizationCodeGrantRequest request) {
        AuthzCodeGrantRequestEntityConverter converter =
            new AuthzCodeGrantRequestEntityConverter(clientRepo.getAzureClient());
        RequestEntity<?> entity = converter.convert(request);
        return Optional.ofNullable(entity)
                       .map(HttpEntity::getHeaders)
                       .orElse(null);
    }
    private Object[] expectedHeaders() {
        return AuthzCodeGrantRequestEntityConverter
            .getHttpHeaders()
            .entrySet()
            .stream()
            .filter(entry -> !entry.getKey().equals("client-request-id"))
            .toArray();
    }

    @SuppressWarnings("unchecked")
    private MultiValueMap<String, String> convertedBodyOf(OAuth2AuthorizationCodeGrantRequest request) {
        AuthzCodeGrantRequestEntityConverter converter =
            new AuthzCodeGrantRequestEntityConverter(clientRepo.getAzureClient());
        RequestEntity<?> entity = converter.convert(request);
        return (MultiValueMap<String, String>) Optional.ofNullable(entity)
                                                       .map(HttpEntity::getBody)
                                                       .orElse(null);
    }

    private OAuth2AuthorizationCodeGrantRequest createCodeGrantRequest(ClientRegistration client) {
        return new OAuth2AuthorizationCodeGrantRequest(client, createExchange(client));
    }

    private OAuth2AuthorizationExchange createExchange(ClientRegistration client) {
        return new OAuth2AuthorizationExchange(
            createAuthorizationRequest(client),
            createAuthorizationResponse());
    }

    private OAuth2AuthorizationRequest createAuthorizationRequest(ClientRegistration client) {
        OAuth2AuthorizationRequest.Builder builder = OAuth2AuthorizationRequest.authorizationCode();
        builder.authorizationUri(client.getProviderDetails().getAuthorizationUri());
        builder.clientId(client.getClientId());
        builder.scopes(client.getScopes());
        builder.state("fake-state");
        builder.redirectUri("http://localhost");
        return builder.build();
    }

    private OAuth2AuthorizationResponse createAuthorizationResponse() {
        OAuth2AuthorizationResponse.Builder builder = OAuth2AuthorizationResponse.success("fake-code");
        builder.redirectUri("http://localhost");
        builder.state("fake-state");
        return builder.build();
    }
}
