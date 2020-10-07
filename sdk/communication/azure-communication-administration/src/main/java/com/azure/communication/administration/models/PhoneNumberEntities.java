// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.administration.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The PhoneNumberEntities model. */
@Fluent
public final class PhoneNumberEntities {
    /*
     * The underlying list of entities.
     */
    @JsonProperty(value = "entities")
    private List<PhoneNumberEntity> entities;

    /*
     * Represents the URL link to the next page
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the entities property: The underlying list of entities.
     *
     * @return the entities value.
     */
    public List<PhoneNumberEntity> getEntities() {
        return this.entities;
    }

    /**
     * Set the entities property: The underlying list of entities.
     *
     * @param entities the entities value to set.
     * @return the PhoneNumberEntities object itself.
     */
    public PhoneNumberEntities setEntities(List<PhoneNumberEntity> entities) {
        this.entities = entities;
        return this;
    }

    /**
     * Get the nextLink property: Represents the URL link to the next page.
     *
     * @return the nextLink value.
     */
    public String getNextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: Represents the URL link to the next page.
     *
     * @param nextLink the nextLink value to set.
     * @return the PhoneNumberEntities object itself.
     */
    public PhoneNumberEntities setNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }
}