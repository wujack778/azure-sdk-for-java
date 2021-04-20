// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.maintenance.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.maintenance.models.UpdateStatus;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Apply Update request. */
@JsonFlatten
@Fluent
public class ApplyUpdateInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ApplyUpdateInner.class);

    /*
     * The status
     */
    @JsonProperty(value = "properties.status")
    private UpdateStatus status;

    /*
     * The resourceId
     */
    @JsonProperty(value = "properties.resourceId")
    private String resourceId;

    /*
     * Last Update time
     */
    @JsonProperty(value = "properties.lastUpdateTime")
    private OffsetDateTime lastUpdateTime;

    /**
     * Get the status property: The status.
     *
     * @return the status value.
     */
    public UpdateStatus status() {
        return this.status;
    }

    /**
     * Set the status property: The status.
     *
     * @param status the status value to set.
     * @return the ApplyUpdateInner object itself.
     */
    public ApplyUpdateInner withStatus(UpdateStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the resourceId property: The resourceId.
     *
     * @return the resourceId value.
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Set the resourceId property: The resourceId.
     *
     * @param resourceId the resourceId value to set.
     * @return the ApplyUpdateInner object itself.
     */
    public ApplyUpdateInner withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * Get the lastUpdateTime property: Last Update time.
     *
     * @return the lastUpdateTime value.
     */
    public OffsetDateTime lastUpdateTime() {
        return this.lastUpdateTime;
    }

    /**
     * Set the lastUpdateTime property: Last Update time.
     *
     * @param lastUpdateTime the lastUpdateTime value to set.
     * @return the ApplyUpdateInner object itself.
     */
    public ApplyUpdateInner withLastUpdateTime(OffsetDateTime lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
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
