// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Customer Managed Identity. */
@Immutable
public final class UserAssignedIdentitiesAutoGenerated {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(UserAssignedIdentitiesAutoGenerated.class);

    /*
     * The principal ID of resource identity.
     */
    @JsonProperty(value = "principalId", access = JsonProperty.Access.WRITE_ONLY)
    private String principalId;

    /*
     * The tenant ID of resource.
     */
    @JsonProperty(value = "tenantId", access = JsonProperty.Access.WRITE_ONLY)
    private String tenantId;

    /*
     * The client ID of resource.
     */
    @JsonProperty(value = "clientId", access = JsonProperty.Access.WRITE_ONLY)
    private String clientId;

    /**
     * Get the principalId property: The principal ID of resource identity.
     *
     * @return the principalId value.
     */
    public String principalId() {
        return this.principalId;
    }

    /**
     * Get the tenantId property: The tenant ID of resource.
     *
     * @return the tenantId value.
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Get the clientId property: The client ID of resource.
     *
     * @return the clientId value.
     */
    public String clientId() {
        return this.clientId;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
