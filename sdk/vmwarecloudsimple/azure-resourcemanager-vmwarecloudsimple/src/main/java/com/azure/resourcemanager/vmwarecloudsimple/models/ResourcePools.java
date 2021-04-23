// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.vmwarecloudsimple.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of ResourcePools. */
public interface ResourcePools {
    /**
     * Returns list of resource pools in region for private cloud.
     *
     * @param regionId The region Id (westus, eastus).
     * @param pcName The private cloud name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of resource pools response model.
     */
    PagedIterable<ResourcePool> list(String regionId, String pcName);

    /**
     * Returns list of resource pools in region for private cloud.
     *
     * @param regionId The region Id (westus, eastus).
     * @param pcName The private cloud name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of resource pools response model.
     */
    PagedIterable<ResourcePool> list(String regionId, String pcName, Context context);

    /**
     * Returns resource pool templates by its name.
     *
     * @param regionId The region Id (westus, eastus).
     * @param pcName The private cloud name.
     * @param resourcePoolName resource pool id (vsphereId).
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return resource pool model.
     */
    ResourcePool get(String regionId, String pcName, String resourcePoolName);

    /**
     * Returns resource pool templates by its name.
     *
     * @param regionId The region Id (westus, eastus).
     * @param pcName The private cloud name.
     * @param resourcePoolName resource pool id (vsphereId).
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return resource pool model.
     */
    Response<ResourcePool> getWithResponse(String regionId, String pcName, String resourcePoolName, Context context);
}
