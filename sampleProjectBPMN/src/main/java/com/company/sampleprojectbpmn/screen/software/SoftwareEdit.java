package com.company.sampleprojectbpmn.screen.software;

import io.jmix.ui.screen.*;
import com.company.sampleprojectbpmn.entity.Software;

@UiController("Software.edit")
@UiDescriptor("software-edit.xml")
@EditedEntityContainer("softwareDc")
public class SoftwareEdit extends StandardEditor<Software> {
}