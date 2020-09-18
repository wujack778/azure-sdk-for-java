// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.fluent.inner.IpAllocationInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The IpAllocationListResult model. */
@Fluent
public final class IpAllocationListResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(IpAllocationListResult.class);

    /*
     * A list of IpAllocation resources.
     */
    @JsonProperty(value = "value")
    private List<IpAllocationInner> value;

    /*
     * The URL to get the next set of results.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: A list of IpAllocation resources.
     *
     * @return the value value.
     */
    public List<IpAllocationInner> value() {
        return this.value;
    }

    /**
     * Set the value property: A list of IpAllocation resources.
     *
     * @param value the value value to set.
     * @return the IpAllocationListResult object itself.
     */
    public IpAllocationListResult withValue(List<IpAllocationInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL to get the next set of results.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The URL to get the next set of results.
     *
     * @param nextLink the nextLink value to set.
     * @return the IpAllocationListResult object itself.
     */
    public IpAllocationListResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}