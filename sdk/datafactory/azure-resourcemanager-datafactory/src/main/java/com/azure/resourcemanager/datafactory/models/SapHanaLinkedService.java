// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/** SAP HANA Linked Service. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("SapHana")
@JsonFlatten
@Fluent
public class SapHanaLinkedService extends LinkedService {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SapHanaLinkedService.class);

    /*
     * SAP HANA ODBC connection string. Type: string, SecureString or
     * AzureKeyVaultSecretReference.
     */
    @JsonProperty(value = "typeProperties.connectionString")
    private Object connectionString;

    /*
     * Host name of the SAP HANA server. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "typeProperties.server")
    private Object server;

    /*
     * The authentication type to be used to connect to the SAP HANA server.
     */
    @JsonProperty(value = "typeProperties.authenticationType")
    private SapHanaAuthenticationType authenticationType;

    /*
     * Username to access the SAP HANA server. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "typeProperties.userName")
    private Object username;

    /*
     * Password to access the SAP HANA server.
     */
    @JsonProperty(value = "typeProperties.password")
    private SecretBase password;

    /*
     * The encrypted credential used for authentication. Credentials are
     * encrypted using the integration runtime credential manager. Type: string
     * (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.encryptedCredential")
    private Object encryptedCredential;

    /**
     * Get the connectionString property: SAP HANA ODBC connection string. Type: string, SecureString or
     * AzureKeyVaultSecretReference.
     *
     * @return the connectionString value.
     */
    public Object connectionString() {
        return this.connectionString;
    }

    /**
     * Set the connectionString property: SAP HANA ODBC connection string. Type: string, SecureString or
     * AzureKeyVaultSecretReference.
     *
     * @param connectionString the connectionString value to set.
     * @return the SapHanaLinkedService object itself.
     */
    public SapHanaLinkedService withConnectionString(Object connectionString) {
        this.connectionString = connectionString;
        return this;
    }

    /**
     * Get the server property: Host name of the SAP HANA server. Type: string (or Expression with resultType string).
     *
     * @return the server value.
     */
    public Object server() {
        return this.server;
    }

    /**
     * Set the server property: Host name of the SAP HANA server. Type: string (or Expression with resultType string).
     *
     * @param server the server value to set.
     * @return the SapHanaLinkedService object itself.
     */
    public SapHanaLinkedService withServer(Object server) {
        this.server = server;
        return this;
    }

    /**
     * Get the authenticationType property: The authentication type to be used to connect to the SAP HANA server.
     *
     * @return the authenticationType value.
     */
    public SapHanaAuthenticationType authenticationType() {
        return this.authenticationType;
    }

    /**
     * Set the authenticationType property: The authentication type to be used to connect to the SAP HANA server.
     *
     * @param authenticationType the authenticationType value to set.
     * @return the SapHanaLinkedService object itself.
     */
    public SapHanaLinkedService withAuthenticationType(SapHanaAuthenticationType authenticationType) {
        this.authenticationType = authenticationType;
        return this;
    }

    /**
     * Get the username property: Username to access the SAP HANA server. Type: string (or Expression with resultType
     * string).
     *
     * @return the username value.
     */
    public Object username() {
        return this.username;
    }

    /**
     * Set the username property: Username to access the SAP HANA server. Type: string (or Expression with resultType
     * string).
     *
     * @param username the username value to set.
     * @return the SapHanaLinkedService object itself.
     */
    public SapHanaLinkedService withUsername(Object username) {
        this.username = username;
        return this;
    }

    /**
     * Get the password property: Password to access the SAP HANA server.
     *
     * @return the password value.
     */
    public SecretBase password() {
        return this.password;
    }

    /**
     * Set the password property: Password to access the SAP HANA server.
     *
     * @param password the password value to set.
     * @return the SapHanaLinkedService object itself.
     */
    public SapHanaLinkedService withPassword(SecretBase password) {
        this.password = password;
        return this;
    }

    /**
     * Get the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @return the encryptedCredential value.
     */
    public Object encryptedCredential() {
        return this.encryptedCredential;
    }

    /**
     * Set the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @param encryptedCredential the encryptedCredential value to set.
     * @return the SapHanaLinkedService object itself.
     */
    public SapHanaLinkedService withEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SapHanaLinkedService withConnectVia(IntegrationRuntimeReference connectVia) {
        super.withConnectVia(connectVia);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SapHanaLinkedService withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SapHanaLinkedService withParameters(Map<String, ParameterSpecification> parameters) {
        super.withParameters(parameters);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SapHanaLinkedService withAnnotations(List<Object> annotations) {
        super.withAnnotations(annotations);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (password() != null) {
            password().validate();
        }
    }
}
