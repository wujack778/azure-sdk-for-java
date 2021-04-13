// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.containers.containerregistry.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Manifest attributes details. */
@Fluent
public final class ManifestAttributesManifestReferences {
    /*
     * Manifest digest
     */
    @JsonProperty(value = "digest", required = true)
    private String digest;

    /*
     * CPU architecture
     */
    @JsonProperty(value = "architecture", required = true)
    private String cpuArchitecture;

    /*
     * Operating system
     */
    @JsonProperty(value = "os", required = true)
    private String operatingSystem;

    /**
     * Get the digest property: Manifest digest.
     *
     * @return the digest value.
     */
    public String getDigest() {
        return this.digest;
    }

    /**
     * Set the digest property: Manifest digest.
     *
     * @param digest the digest value to set.
     * @return the ManifestAttributesManifestReferences object itself.
     */
    public ManifestAttributesManifestReferences setDigest(String digest) {
        this.digest = digest;
        return this;
    }

    /**
     * Get the cpuArchitecture property: CPU architecture.
     *
     * @return the cpuArchitecture value.
     */
    public String getCpuArchitecture() {
        return this.cpuArchitecture;
    }

    /**
     * Set the cpuArchitecture property: CPU architecture.
     *
     * @param cpuArchitecture the cpuArchitecture value to set.
     * @return the ManifestAttributesManifestReferences object itself.
     */
    public ManifestAttributesManifestReferences setCpuArchitecture(String cpuArchitecture) {
        this.cpuArchitecture = cpuArchitecture;
        return this;
    }

    /**
     * Get the operatingSystem property: Operating system.
     *
     * @return the operatingSystem value.
     */
    public String getOperatingSystem() {
        return this.operatingSystem;
    }

    /**
     * Set the operatingSystem property: Operating system.
     *
     * @param operatingSystem the operatingSystem value to set.
     * @return the ManifestAttributesManifestReferences object itself.
     */
    public ManifestAttributesManifestReferences setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
        return this;
    }
}
