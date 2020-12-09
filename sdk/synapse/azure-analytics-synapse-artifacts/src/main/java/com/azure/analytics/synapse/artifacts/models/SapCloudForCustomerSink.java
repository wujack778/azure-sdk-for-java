// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** A copy activity SAP Cloud for Customer sink. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("SapCloudForCustomerSink")
@Fluent
public final class SapCloudForCustomerSink extends CopySink {
    /*
     * The write behavior for the operation. Default is 'Insert'.
     */
    @JsonProperty(value = "writeBehavior")
    private SapCloudForCustomerSinkWriteBehavior writeBehavior;

    /**
     * Get the writeBehavior property: The write behavior for the operation. Default is 'Insert'.
     *
     * @return the writeBehavior value.
     */
    public SapCloudForCustomerSinkWriteBehavior getWriteBehavior() {
        return this.writeBehavior;
    }

    /**
     * Set the writeBehavior property: The write behavior for the operation. Default is 'Insert'.
     *
     * @param writeBehavior the writeBehavior value to set.
     * @return the SapCloudForCustomerSink object itself.
     */
    public SapCloudForCustomerSink setWriteBehavior(SapCloudForCustomerSinkWriteBehavior writeBehavior) {
        this.writeBehavior = writeBehavior;
        return this;
    }
}
