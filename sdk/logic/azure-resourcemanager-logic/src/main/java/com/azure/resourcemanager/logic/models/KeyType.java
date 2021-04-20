// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for KeyType. */
public final class KeyType extends ExpandableStringEnum<KeyType> {
    /** Static value NotSpecified for KeyType. */
    public static final KeyType NOT_SPECIFIED = fromString("NotSpecified");

    /** Static value Primary for KeyType. */
    public static final KeyType PRIMARY = fromString("Primary");

    /** Static value Secondary for KeyType. */
    public static final KeyType SECONDARY = fromString("Secondary");

    /**
     * Creates or finds a KeyType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding KeyType.
     */
    @JsonCreator
    public static KeyType fromString(String name) {
        return fromString(name, KeyType.class);
    }

    /** @return known KeyType values. */
    public static Collection<KeyType> values() {
        return values(KeyType.class);
    }
}
