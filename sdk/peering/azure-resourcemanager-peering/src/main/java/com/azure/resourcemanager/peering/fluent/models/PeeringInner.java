// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.peering.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.peering.models.Kind;
import com.azure.resourcemanager.peering.models.PeeringPropertiesDirect;
import com.azure.resourcemanager.peering.models.PeeringPropertiesExchange;
import com.azure.resourcemanager.peering.models.PeeringSku;
import com.azure.resourcemanager.peering.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Peering is a logical representation of a set of connections to the Microsoft Cloud Edge at a location. */
@JsonFlatten
@Fluent
public class PeeringInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PeeringInner.class);

    /*
     * The SKU that defines the tier and kind of the peering.
     */
    @JsonProperty(value = "sku", required = true)
    private PeeringSku sku;

    /*
     * The kind of the peering.
     */
    @JsonProperty(value = "kind", required = true)
    private Kind kind;

    /*
     * The location of the resource.
     */
    @JsonProperty(value = "location", required = true)
    private String location;

    /*
     * The resource tags.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /*
     * The properties that define a direct peering.
     */
    @JsonProperty(value = "properties.direct")
    private PeeringPropertiesDirect direct;

    /*
     * The properties that define an exchange peering.
     */
    @JsonProperty(value = "properties.exchange")
    private PeeringPropertiesExchange exchange;

    /*
     * The location of the peering.
     */
    @JsonProperty(value = "properties.peeringLocation")
    private String peeringLocation;

    /*
     * The provisioning state of the resource.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * Get the sku property: The SKU that defines the tier and kind of the peering.
     *
     * @return the sku value.
     */
    public PeeringSku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: The SKU that defines the tier and kind of the peering.
     *
     * @param sku the sku value to set.
     * @return the PeeringInner object itself.
     */
    public PeeringInner withSku(PeeringSku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the kind property: The kind of the peering.
     *
     * @return the kind value.
     */
    public Kind kind() {
        return this.kind;
    }

    /**
     * Set the kind property: The kind of the peering.
     *
     * @param kind the kind value to set.
     * @return the PeeringInner object itself.
     */
    public PeeringInner withKind(Kind kind) {
        this.kind = kind;
        return this;
    }

    /**
     * Get the location property: The location of the resource.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: The location of the resource.
     *
     * @param location the location value to set.
     * @return the PeeringInner object itself.
     */
    public PeeringInner withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the tags property: The resource tags.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: The resource tags.
     *
     * @param tags the tags value to set.
     * @return the PeeringInner object itself.
     */
    public PeeringInner withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the direct property: The properties that define a direct peering.
     *
     * @return the direct value.
     */
    public PeeringPropertiesDirect direct() {
        return this.direct;
    }

    /**
     * Set the direct property: The properties that define a direct peering.
     *
     * @param direct the direct value to set.
     * @return the PeeringInner object itself.
     */
    public PeeringInner withDirect(PeeringPropertiesDirect direct) {
        this.direct = direct;
        return this;
    }

    /**
     * Get the exchange property: The properties that define an exchange peering.
     *
     * @return the exchange value.
     */
    public PeeringPropertiesExchange exchange() {
        return this.exchange;
    }

    /**
     * Set the exchange property: The properties that define an exchange peering.
     *
     * @param exchange the exchange value to set.
     * @return the PeeringInner object itself.
     */
    public PeeringInner withExchange(PeeringPropertiesExchange exchange) {
        this.exchange = exchange;
        return this;
    }

    /**
     * Get the peeringLocation property: The location of the peering.
     *
     * @return the peeringLocation value.
     */
    public String peeringLocation() {
        return this.peeringLocation;
    }

    /**
     * Set the peeringLocation property: The location of the peering.
     *
     * @param peeringLocation the peeringLocation value to set.
     * @return the PeeringInner object itself.
     */
    public PeeringInner withPeeringLocation(String peeringLocation) {
        this.peeringLocation = peeringLocation;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sku() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property sku in model PeeringInner"));
        } else {
            sku().validate();
        }
        if (kind() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property kind in model PeeringInner"));
        }
        if (location() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property location in model PeeringInner"));
        }
        if (direct() != null) {
            direct().validate();
        }
        if (exchange() != null) {
            exchange().validate();
        }
    }
}
