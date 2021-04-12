// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.implementation;

import com.azure.resourcemanager.eventgrid.fluent.models.TopicSharedAccessKeysInner;
import com.azure.resourcemanager.eventgrid.models.TopicSharedAccessKeys;

public final class TopicSharedAccessKeysImpl implements TopicSharedAccessKeys {
    private TopicSharedAccessKeysInner innerObject;

    private final com.azure.resourcemanager.eventgrid.EventGridManager serviceManager;

    TopicSharedAccessKeysImpl(
        TopicSharedAccessKeysInner innerObject, com.azure.resourcemanager.eventgrid.EventGridManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String key1() {
        return this.innerModel().key1();
    }

    public String key2() {
        return this.innerModel().key2();
    }

    public TopicSharedAccessKeysInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.eventgrid.EventGridManager manager() {
        return this.serviceManager;
    }
}
