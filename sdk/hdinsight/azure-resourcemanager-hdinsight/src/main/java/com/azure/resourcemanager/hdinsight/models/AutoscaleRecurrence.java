// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Schedule-based autoscale request parameters. */
@Fluent
public final class AutoscaleRecurrence {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AutoscaleRecurrence.class);

    /*
     * The time zone for the autoscale schedule times
     */
    @JsonProperty(value = "timeZone")
    private String timeZone;

    /*
     * Array of schedule-based autoscale rules
     */
    @JsonProperty(value = "schedule")
    private List<AutoscaleSchedule> schedule;

    /**
     * Get the timeZone property: The time zone for the autoscale schedule times.
     *
     * @return the timeZone value.
     */
    public String timeZone() {
        return this.timeZone;
    }

    /**
     * Set the timeZone property: The time zone for the autoscale schedule times.
     *
     * @param timeZone the timeZone value to set.
     * @return the AutoscaleRecurrence object itself.
     */
    public AutoscaleRecurrence withTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }

    /**
     * Get the schedule property: Array of schedule-based autoscale rules.
     *
     * @return the schedule value.
     */
    public List<AutoscaleSchedule> schedule() {
        return this.schedule;
    }

    /**
     * Set the schedule property: Array of schedule-based autoscale rules.
     *
     * @param schedule the schedule value to set.
     * @return the AutoscaleRecurrence object itself.
     */
    public AutoscaleRecurrence withSchedule(List<AutoscaleSchedule> schedule) {
        this.schedule = schedule;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (schedule() != null) {
            schedule().forEach(e -> e.validate());
        }
    }
}
