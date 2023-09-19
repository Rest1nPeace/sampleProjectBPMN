package com.company.sampleprojectbpmn.screen.department;

import io.jmix.ui.screen.*;
import com.company.sampleprojectbpmn.entity.Department;

@UiController("Department.browse")
@UiDescriptor("department-browse.xml")
@LookupComponent("departmentsTable")
public class DepartmentBrowse extends StandardLookup<Department> {
}