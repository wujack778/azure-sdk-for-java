// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.automation.fluent.models.VariableInner;
import com.azure.resourcemanager.automation.models.Variable;
import com.azure.resourcemanager.automation.models.VariableCreateOrUpdateParameters;
import com.azure.resourcemanager.automation.models.VariableUpdateParameters;
import java.time.OffsetDateTime;

public final class VariableImpl implements Variable, Variable.Definition, Variable.Update {
    private VariableInner innerObject;

    private final com.azure.resourcemanager.automation.AutomationManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String value() {
        return this.innerModel().value();
    }

    public Boolean isEncrypted() {
        return this.innerModel().isEncrypted();
    }

    public OffsetDateTime creationTime() {
        return this.innerModel().creationTime();
    }

    public OffsetDateTime lastModifiedTime() {
        return this.innerModel().lastModifiedTime();
    }

    public String description() {
        return this.innerModel().description();
    }

    public VariableInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.automation.AutomationManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String automationAccountName;

    private String variableName;

    private VariableCreateOrUpdateParameters createParameters;

    private VariableUpdateParameters updateParameters;

    public VariableImpl withExistingAutomationAccount(String resourceGroupName, String automationAccountName) {
        this.resourceGroupName = resourceGroupName;
        this.automationAccountName = automationAccountName;
        return this;
    }

    public Variable create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVariables()
                .createOrUpdateWithResponse(
                    resourceGroupName, automationAccountName, variableName, createParameters, Context.NONE)
                .getValue();
        return this;
    }

    public Variable create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVariables()
                .createOrUpdateWithResponse(
                    resourceGroupName, automationAccountName, variableName, createParameters, context)
                .getValue();
        return this;
    }

    VariableImpl(String name, com.azure.resourcemanager.automation.AutomationManager serviceManager) {
        this.innerObject = new VariableInner();
        this.serviceManager = serviceManager;
        this.variableName = name;
        this.createParameters = new VariableCreateOrUpdateParameters();
    }

    public VariableImpl update() {
        this.updateParameters = new VariableUpdateParameters();
        return this;
    }

    public Variable apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVariables()
                .updateWithResponse(
                    resourceGroupName, automationAccountName, variableName, updateParameters, Context.NONE)
                .getValue();
        return this;
    }

    public Variable apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVariables()
                .updateWithResponse(resourceGroupName, automationAccountName, variableName, updateParameters, context)
                .getValue();
        return this;
    }

    VariableImpl(VariableInner innerObject, com.azure.resourcemanager.automation.AutomationManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.automationAccountName = Utils.getValueFromIdByName(innerObject.id(), "automationAccounts");
        this.variableName = Utils.getValueFromIdByName(innerObject.id(), "variables");
    }

    public Variable refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVariables()
                .getWithResponse(resourceGroupName, automationAccountName, variableName, Context.NONE)
                .getValue();
        return this;
    }

    public Variable refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVariables()
                .getWithResponse(resourceGroupName, automationAccountName, variableName, context)
                .getValue();
        return this;
    }

    public VariableImpl withName(String name) {
        if (isInCreateMode()) {
            this.createParameters.withName(name);
            return this;
        } else {
            this.updateParameters.withName(name);
            return this;
        }
    }

    public VariableImpl withValue(String value) {
        if (isInCreateMode()) {
            this.createParameters.withValue(value);
            return this;
        } else {
            this.updateParameters.withValue(value);
            return this;
        }
    }

    public VariableImpl withDescription(String description) {
        if (isInCreateMode()) {
            this.createParameters.withDescription(description);
            return this;
        } else {
            this.updateParameters.withDescription(description);
            return this;
        }
    }

    public VariableImpl withIsEncrypted(Boolean isEncrypted) {
        this.createParameters.withIsEncrypted(isEncrypted);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
