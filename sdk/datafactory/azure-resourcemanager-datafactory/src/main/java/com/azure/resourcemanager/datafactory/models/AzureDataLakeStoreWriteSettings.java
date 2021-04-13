// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Azure data lake store write settings. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("AzureDataLakeStoreWriteSettings")
@Fluent
public final class AzureDataLakeStoreWriteSettings extends StoreWriteSettings {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AzureDataLakeStoreWriteSettings.class);

    /*
     * Specifies the expiry time of the written files. The time is applied to
     * the UTC time zone in the format of "2018-12-01T05:00:00Z". Default value
     * is NULL. Type: integer (or Expression with resultType integer).
     */
    @JsonProperty(value = "expiryDateTime")
    private Object expiryDateTime;

    /**
     * Get the expiryDateTime property: Specifies the expiry time of the written files. The time is applied to the UTC
     * time zone in the format of "2018-12-01T05:00:00Z". Default value is NULL. Type: integer (or Expression with
     * resultType integer).
     *
     * @return the expiryDateTime value.
     */
    public Object expiryDateTime() {
        return this.expiryDateTime;
    }

    /**
     * Set the expiryDateTime property: Specifies the expiry time of the written files. The time is applied to the UTC
     * time zone in the format of "2018-12-01T05:00:00Z". Default value is NULL. Type: integer (or Expression with
     * resultType integer).
     *
     * @param expiryDateTime the expiryDateTime value to set.
     * @return the AzureDataLakeStoreWriteSettings object itself.
     */
    public AzureDataLakeStoreWriteSettings withExpiryDateTime(Object expiryDateTime) {
        this.expiryDateTime = expiryDateTime;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureDataLakeStoreWriteSettings withMaxConcurrentConnections(Object maxConcurrentConnections) {
        super.withMaxConcurrentConnections(maxConcurrentConnections);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureDataLakeStoreWriteSettings withCopyBehavior(Object copyBehavior) {
        super.withCopyBehavior(copyBehavior);
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
    }
}
