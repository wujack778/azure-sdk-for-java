// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.fluent.inner;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The RecoveryWalkResponse model. */
@Immutable
public final class RecoveryWalkResponseInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RecoveryWalkResponseInner.class);

    /*
     * Whether the recovery walk was performed
     */
    @JsonProperty(value = "walkPerformed", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean walkPerformed;

    /*
     * The next update domain that needs to be walked. Null means walk spanning
     * all update domains has been completed
     */
    @JsonProperty(value = "nextPlatformUpdateDomain", access = JsonProperty.Access.WRITE_ONLY)
    private Integer nextPlatformUpdateDomain;

    /**
     * Get the walkPerformed property: Whether the recovery walk was performed.
     *
     * @return the walkPerformed value.
     */
    public Boolean walkPerformed() {
        return this.walkPerformed;
    }

    /**
     * Get the nextPlatformUpdateDomain property: The next update domain that needs to be walked. Null means walk
     * spanning all update domains has been completed.
     *
     * @return the nextPlatformUpdateDomain value.
     */
    public Integer nextPlatformUpdateDomain() {
        return this.nextPlatformUpdateDomain;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}