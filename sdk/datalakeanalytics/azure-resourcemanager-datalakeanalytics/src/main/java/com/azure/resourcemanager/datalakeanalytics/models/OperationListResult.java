// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datalakeanalytics.models;

import com.azure.resourcemanager.datalakeanalytics.fluent.models.OperationListResultInner;
import java.util.List;

/** An immutable client-side representation of OperationListResult. */
public interface OperationListResult {
    /**
     * Gets the value property: The results of the list operation.
     *
     * @return the value value.
     */
    List<Operation> value();

    /**
     * Gets the nextLink property: The link (url) to the next page of results.
     *
     * @return the nextLink value.
     */
    String nextLink();

    /**
     * Gets the inner com.azure.resourcemanager.datalakeanalytics.fluent.models.OperationListResultInner object.
     *
     * @return the inner object.
     */
    OperationListResultInner innerModel();
}
