// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for SkuName. */
public final class SkuName extends ExpandableStringEnum<SkuName> {
    /** Static value NotSpecified for SkuName. */
    public static final SkuName NOT_SPECIFIED = fromString("NotSpecified");

    /** Static value Free for SkuName. */
    public static final SkuName FREE = fromString("Free");

    /** Static value Shared for SkuName. */
    public static final SkuName SHARED = fromString("Shared");

    /** Static value Basic for SkuName. */
    public static final SkuName BASIC = fromString("Basic");

    /** Static value Standard for SkuName. */
    public static final SkuName STANDARD = fromString("Standard");

    /** Static value Premium for SkuName. */
    public static final SkuName PREMIUM = fromString("Premium");

    /**
     * Creates or finds a SkuName from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SkuName.
     */
    @JsonCreator
    public static SkuName fromString(String name) {
        return fromString(name, SkuName.class);
    }

    /** @return known SkuName values. */
    public static Collection<SkuName> values() {
        return values(SkuName.class);
    }
}
