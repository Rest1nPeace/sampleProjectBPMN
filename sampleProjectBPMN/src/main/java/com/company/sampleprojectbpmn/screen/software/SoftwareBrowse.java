package com.company.sampleprojectbpmn.screen.software;

import io.jmix.ui.screen.*;
import com.company.sampleprojectbpmn.entity.Software;

@UiController("Software.browse")
@UiDescriptor("software-browse.xml")
@LookupComponent("softwaresTable")
public class SoftwareBrowse extends StandardLookup<Software> {
}