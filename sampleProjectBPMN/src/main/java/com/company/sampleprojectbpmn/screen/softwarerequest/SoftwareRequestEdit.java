package com.company.sampleprojectbpmn.screen.softwarerequest;

import io.jmix.ui.screen.*;
import com.company.sampleprojectbpmn.entity.SoftwareRequest;

@UiController("SoftwareRequest.edit")
@UiDescriptor("software-request-edit.xml")
@EditedEntityContainer("softwareRequestDc")
public class SoftwareRequestEdit extends StandardEditor<SoftwareRequest> {
}