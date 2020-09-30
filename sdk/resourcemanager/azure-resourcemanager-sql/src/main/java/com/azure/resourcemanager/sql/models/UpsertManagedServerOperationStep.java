// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The UpsertManagedServerOperationStep model. */
@Fluent
public final class UpsertManagedServerOperationStep {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(UpsertManagedServerOperationStep.class);

    /*
     * The order property.
     */
    @JsonProperty(value = "order")
    private Integer order;

    /*
     * The name property.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The status property.
     */
    @JsonProperty(value = "status")
    private UpsertManagedServerOperationStepStatus status;

    /**
     * Get the order property: The order property.
     *
     * @return the order value.
     */
    public Integer order() {
        return this.order;
    }

    /**
     * Set the order property: The order property.
     *
     * @param order the order value to set.
     * @return the UpsertManagedServerOperationStep object itself.
     */
    public UpsertManagedServerOperationStep withOrder(Integer order) {
        this.order = order;
        return this;
    }

    /**
     * Get the name property: The name property.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name property.
     *
     * @param name the name value to set.
     * @return the UpsertManagedServerOperationStep object itself.
     */
    public UpsertManagedServerOperationStep withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the status property: The status property.
     *
     * @return the status value.
     */
    public UpsertManagedServerOperationStepStatus status() {
        return this.status;
    }

    /**
     * Set the status property: The status property.
     *
     * @param status the status value to set.
     * @return the UpsertManagedServerOperationStep object itself.
     */
    public UpsertManagedServerOperationStep withStatus(UpsertManagedServerOperationStepStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}