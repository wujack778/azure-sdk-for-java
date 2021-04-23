// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.models;

import com.azure.resourcemanager.applicationinsights.fluent.models.ApplicationInsightsComponentAnalyticsItemInner;

/** An immutable client-side representation of ApplicationInsightsComponentAnalyticsItem. */
public interface ApplicationInsightsComponentAnalyticsItem {
    /**
     * Gets the id property: Internally assigned unique id of the item definition.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The user-defined name of the item.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the content property: The content of this item.
     *
     * @return the content value.
     */
    String content();

    /**
     * Gets the version property: This instance's version of the data model. This can change as new features are added.
     *
     * @return the version value.
     */
    String version();

    /**
     * Gets the scope property: Enum indicating if this item definition is owned by a specific user or is shared between
     * all users with access to the Application Insights component.
     *
     * @return the scope value.
     */
    ItemScope scope();

    /**
     * Gets the type property: Enum indicating the type of the Analytics item.
     *
     * @return the type value.
     */
    ItemType type();

    /**
     * Gets the timeCreated property: Date and time in UTC when this item was created.
     *
     * @return the timeCreated value.
     */
    String timeCreated();

    /**
     * Gets the timeModified property: Date and time in UTC of the last modification that was made to this item.
     *
     * @return the timeModified value.
     */
    String timeModified();

    /**
     * Gets the properties property: A set of properties that can be defined in the context of a specific item type.
     * Each type may have its own properties.
     *
     * @return the properties value.
     */
    ApplicationInsightsComponentAnalyticsItemProperties properties();

    /**
     * Gets the inner
     * com.azure.resourcemanager.applicationinsights.fluent.models.ApplicationInsightsComponentAnalyticsItemInner
     * object.
     *
     * @return the inner object.
     */
    ApplicationInsightsComponentAnalyticsItemInner innerModel();
}
