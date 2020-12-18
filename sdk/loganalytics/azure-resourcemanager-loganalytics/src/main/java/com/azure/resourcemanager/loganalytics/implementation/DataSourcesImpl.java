// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loganalytics.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.loganalytics.LogAnalyticsManager;
import com.azure.resourcemanager.loganalytics.fluent.DataSourcesClient;
import com.azure.resourcemanager.loganalytics.fluent.models.DataSourceInner;
import com.azure.resourcemanager.loganalytics.models.DataSource;
import com.azure.resourcemanager.loganalytics.models.DataSources;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class DataSourcesImpl implements DataSources {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DataSourcesImpl.class);

    private final DataSourcesClient innerClient;

    private final LogAnalyticsManager serviceManager;

    public DataSourcesImpl(DataSourcesClient innerClient, LogAnalyticsManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void delete(String resourceGroupName, String workspaceName, String dataSourceName) {
        this.serviceClient().delete(resourceGroupName, workspaceName, dataSourceName);
    }

    public Response<Void> deleteWithResponse(
        String resourceGroupName, String workspaceName, String dataSourceName, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, workspaceName, dataSourceName, context);
    }

    public DataSource get(String resourceGroupName, String workspaceName, String dataSourceName) {
        DataSourceInner inner = this.serviceClient().get(resourceGroupName, workspaceName, dataSourceName);
        if (inner != null) {
            return new DataSourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<DataSource> getWithResponse(
        String resourceGroupName, String workspaceName, String dataSourceName, Context context) {
        Response<DataSourceInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, workspaceName, dataSourceName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new DataSourceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<DataSource> listByWorkspace(String resourceGroupName, String workspaceName, String filter) {
        PagedIterable<DataSourceInner> inner =
            this.serviceClient().listByWorkspace(resourceGroupName, workspaceName, filter);
        return inner.mapPage(inner1 -> new DataSourceImpl(inner1, this.manager()));
    }

    public PagedIterable<DataSource> listByWorkspace(
        String resourceGroupName, String workspaceName, String filter, String skiptoken, Context context) {
        PagedIterable<DataSourceInner> inner =
            this.serviceClient().listByWorkspace(resourceGroupName, workspaceName, filter, skiptoken, context);
        return inner.mapPage(inner1 -> new DataSourceImpl(inner1, this.manager()));
    }

    public DataSource getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourcegroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourcegroups'.", id)));
        }
        String workspaceName = Utils.getValueFromIdByName(id, "workspaces");
        if (workspaceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'workspaces'.", id)));
        }
        String dataSourceName = Utils.getValueFromIdByName(id, "dataSources");
        if (dataSourceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'dataSources'.", id)));
        }
        return this.getWithResponse(resourceGroupName, workspaceName, dataSourceName, Context.NONE).getValue();
    }

    public Response<DataSource> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourcegroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourcegroups'.", id)));
        }
        String workspaceName = Utils.getValueFromIdByName(id, "workspaces");
        if (workspaceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'workspaces'.", id)));
        }
        String dataSourceName = Utils.getValueFromIdByName(id, "dataSources");
        if (dataSourceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'dataSources'.", id)));
        }
        return this.getWithResponse(resourceGroupName, workspaceName, dataSourceName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourcegroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourcegroups'.", id)));
        }
        String workspaceName = Utils.getValueFromIdByName(id, "workspaces");
        if (workspaceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'workspaces'.", id)));
        }
        String dataSourceName = Utils.getValueFromIdByName(id, "dataSources");
        if (dataSourceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'dataSources'.", id)));
        }
        this.deleteWithResponse(resourceGroupName, workspaceName, dataSourceName, Context.NONE).getValue();
    }

    public Response<Void> deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourcegroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourcegroups'.", id)));
        }
        String workspaceName = Utils.getValueFromIdByName(id, "workspaces");
        if (workspaceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'workspaces'.", id)));
        }
        String dataSourceName = Utils.getValueFromIdByName(id, "dataSources");
        if (dataSourceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'dataSources'.", id)));
        }
        return this.deleteWithResponse(resourceGroupName, workspaceName, dataSourceName, context);
    }

    private DataSourcesClient serviceClient() {
        return this.innerClient;
    }

    private LogAnalyticsManager manager() {
        return this.serviceManager;
    }

    public DataSourceImpl define(String name) {
        return new DataSourceImpl(name, this.manager());
    }
}
