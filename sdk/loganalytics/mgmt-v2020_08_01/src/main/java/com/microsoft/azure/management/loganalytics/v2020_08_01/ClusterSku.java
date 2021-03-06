/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.loganalytics.v2020_08_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The cluster sku definition.
 */
public class ClusterSku {
    /**
     * The capacity value.
     */
    @JsonProperty(value = "capacity")
    private Long capacity;

    /**
     * The name of the SKU. Possible values include: 'CapacityReservation'.
     */
    @JsonProperty(value = "name")
    private ClusterSkuNameEnum name;

    /**
     * Get the capacity value.
     *
     * @return the capacity value
     */
    public Long capacity() {
        return this.capacity;
    }

    /**
     * Set the capacity value.
     *
     * @param capacity the capacity value to set
     * @return the ClusterSku object itself.
     */
    public ClusterSku withCapacity(Long capacity) {
        this.capacity = capacity;
        return this;
    }

    /**
     * Get the name of the SKU. Possible values include: 'CapacityReservation'.
     *
     * @return the name value
     */
    public ClusterSkuNameEnum name() {
        return this.name;
    }

    /**
     * Set the name of the SKU. Possible values include: 'CapacityReservation'.
     *
     * @param name the name value to set
     * @return the ClusterSku object itself.
     */
    public ClusterSku withName(ClusterSkuNameEnum name) {
        this.name = name;
        return this;
    }

}
