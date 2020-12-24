/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appplatform.v2020_11_01_preview.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Resource upload definition payload.
 */
public class ResourceUploadDefinitionInner {
    /**
     * Source relative path.
     */
    @JsonProperty(value = "relativePath")
    private String relativePath;

    /**
     * Upload URL.
     */
    @JsonProperty(value = "uploadUrl")
    private String uploadUrl;

    /**
     * Get source relative path.
     *
     * @return the relativePath value
     */
    public String relativePath() {
        return this.relativePath;
    }

    /**
     * Set source relative path.
     *
     * @param relativePath the relativePath value to set
     * @return the ResourceUploadDefinitionInner object itself.
     */
    public ResourceUploadDefinitionInner withRelativePath(String relativePath) {
        this.relativePath = relativePath;
        return this;
    }

    /**
     * Get upload URL.
     *
     * @return the uploadUrl value
     */
    public String uploadUrl() {
        return this.uploadUrl;
    }

    /**
     * Set upload URL.
     *
     * @param uploadUrl the uploadUrl value to set
     * @return the ResourceUploadDefinitionInner object itself.
     */
    public ResourceUploadDefinitionInner withUploadUrl(String uploadUrl) {
        this.uploadUrl = uploadUrl;
        return this;
    }

}
