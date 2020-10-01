// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.storage.models.ObjectReplicationPolicyRule;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** The replication policy between two storage accounts. Multiple rules can be defined in one policy. */
@JsonFlatten
@Fluent
public class ObjectReplicationPolicyInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ObjectReplicationPolicyInner.class);

    /*
     * A unique id for object replication policy.
     */
    @JsonProperty(value = "properties.policyId", access = JsonProperty.Access.WRITE_ONLY)
    private String policyId;

    /*
     * Indicates when the policy is enabled on the source account.
     */
    @JsonProperty(value = "properties.enabledTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime enabledTime;

    /*
     * Required. Source account name.
     */
    @JsonProperty(value = "properties.sourceAccount")
    private String sourceAccount;

    /*
     * Required. Destination account name.
     */
    @JsonProperty(value = "properties.destinationAccount")
    private String destinationAccount;

    /*
     * The storage account object replication rules.
     */
    @JsonProperty(value = "properties.rules")
    private List<ObjectReplicationPolicyRule> rules;

    /**
     * Get the policyId property: A unique id for object replication policy.
     *
     * @return the policyId value.
     */
    public String policyId() {
        return this.policyId;
    }

    /**
     * Get the enabledTime property: Indicates when the policy is enabled on the source account.
     *
     * @return the enabledTime value.
     */
    public OffsetDateTime enabledTime() {
        return this.enabledTime;
    }

    /**
     * Get the sourceAccount property: Required. Source account name.
     *
     * @return the sourceAccount value.
     */
    public String sourceAccount() {
        return this.sourceAccount;
    }

    /**
     * Set the sourceAccount property: Required. Source account name.
     *
     * @param sourceAccount the sourceAccount value to set.
     * @return the ObjectReplicationPolicyInner object itself.
     */
    public ObjectReplicationPolicyInner withSourceAccount(String sourceAccount) {
        this.sourceAccount = sourceAccount;
        return this;
    }

    /**
     * Get the destinationAccount property: Required. Destination account name.
     *
     * @return the destinationAccount value.
     */
    public String destinationAccount() {
        return this.destinationAccount;
    }

    /**
     * Set the destinationAccount property: Required. Destination account name.
     *
     * @param destinationAccount the destinationAccount value to set.
     * @return the ObjectReplicationPolicyInner object itself.
     */
    public ObjectReplicationPolicyInner withDestinationAccount(String destinationAccount) {
        this.destinationAccount = destinationAccount;
        return this;
    }

    /**
     * Get the rules property: The storage account object replication rules.
     *
     * @return the rules value.
     */
    public List<ObjectReplicationPolicyRule> rules() {
        return this.rules;
    }

    /**
     * Set the rules property: The storage account object replication rules.
     *
     * @param rules the rules value to set.
     * @return the ObjectReplicationPolicyInner object itself.
     */
    public ObjectReplicationPolicyInner withRules(List<ObjectReplicationPolicyRule> rules) {
        this.rules = rules;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (rules() != null) {
            rules().forEach(e -> e.validate());
        }
    }
}