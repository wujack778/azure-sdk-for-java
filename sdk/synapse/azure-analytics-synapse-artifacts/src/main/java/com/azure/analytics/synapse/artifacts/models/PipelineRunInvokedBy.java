// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Provides entity name and id that started the pipeline run. */
@Immutable
public final class PipelineRunInvokedBy {
    /*
     * Name of the entity that started the pipeline run.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * The ID of the entity that started the run.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * The type of the entity that started the run.
     */
    @JsonProperty(value = "invokedByType", access = JsonProperty.Access.WRITE_ONLY)
    private String invokedByType;

    /**
     * Get the name property: Name of the entity that started the pipeline run.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Get the id property: The ID of the entity that started the run.
     *
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Get the invokedByType property: The type of the entity that started the run.
     *
     * @return the invokedByType value.
     */
    public String getInvokedByType() {
        return this.invokedByType;
    }
}
