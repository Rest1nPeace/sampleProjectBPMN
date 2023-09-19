package com.company.sampleprojectbpmn.screen.workspacerequest;

import com.company.sampleprojectbpmn.entity.WorkspaceRequest;
import io.jmix.ui.screen.*;

@UiController("WorkspaceRequest.browse")
@UiDescriptor("workspace-request-browse.xml")
@LookupComponent("workspaceRequestsTable")
public class WorkspaceRequestBrowse extends StandardLookup<WorkspaceRequest> {
}