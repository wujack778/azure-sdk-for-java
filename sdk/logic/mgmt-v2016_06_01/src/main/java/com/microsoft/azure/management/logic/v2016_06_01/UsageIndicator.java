/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2016_06_01;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for UsageIndicator.
 */
public enum UsageIndicator {
    /** Enum value NotSpecified. */
    NOT_SPECIFIED("NotSpecified"),

    /** Enum value Test. */
    TEST("Test"),

    /** Enum value Information. */
    INFORMATION("Information"),

    /** Enum value Production. */
    PRODUCTION("Production");

    /** The actual serialized value for a UsageIndicator instance. */
    private String value;

    UsageIndicator(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a UsageIndicator instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed UsageIndicator object, or null if unable to parse.
     */
    @JsonCreator
    public static UsageIndicator fromString(String value) {
        UsageIndicator[] items = UsageIndicator.values();
        for (UsageIndicator item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
