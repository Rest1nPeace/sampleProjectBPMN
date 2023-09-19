package com.company.sampleprojectbpmn.screen.workspacerequest;

import com.company.sampleprojectbpmn.entity.User;
import com.company.sampleprojectbpmn.entity.WorkspaceRequest;
import io.jmix.ui.component.EntityPicker;
import io.jmix.ui.screen.*;
import io.jmix.core.usersubstitution.CurrentUserSubstitution;
import org.springframework.beans.factory.annotation.Autowired;

@UiController("WorkspaceRequest.edit")
@UiDescriptor("workspace-request-edit.xml")
@EditedEntityContainer("workspaceRequestDc")
//@ProcessForm()
public class WorkspaceRequestEdit extends StandardEditor<WorkspaceRequest> {

    @Autowired
    private CurrentUserSubstitution currentUserSubstitution;
    @Autowired
    private EntityPicker<User> hrManagerField;

    @Subscribe
    public void onAfterInit(AfterInitEvent event) {
        User user = (User) currentUserSubstitution.getEffectiveUser();
        hrManagerField.setValue(user);

    }
}