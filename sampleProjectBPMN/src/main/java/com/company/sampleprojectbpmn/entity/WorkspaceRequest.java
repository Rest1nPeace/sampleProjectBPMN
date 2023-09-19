package com.company.sampleprojectbpmn.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.Composition;
import io.jmix.core.metamodel.annotation.JmixEntity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@JmixEntity
@Table(name = "WORKSPACE_REQUEST", indexes = {
        @Index(name = "IDX_WORKSPACEREQUEST_HRMANAGER", columnList = "HR_MANAGER_ID"),
        @Index(name = "IDX_WORKSPACE_REQUEST_EMPLOYEE", columnList = "EMPLOYEE_ID")
})
@Entity
public class WorkspaceRequest {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @Column(name = "DATE_")
    private LocalDate date;

    @JoinColumn(name = "HR_MANAGER_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private User hrManager;

    @JoinColumn(name = "EMPLOYEE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private User employee;

    @Column(name = "WORK_TYPE")
    private String workType;

    @Composition
    @OrderBy("softValue")
    @OneToMany(mappedBy = "workspaceRequest")
    private List<SoftwareRequest> softwareRequests;

    public List<SoftwareRequest> getSoftwareRequests() {
        return softwareRequests;
    }

    public void setSoftwareRequests(List<SoftwareRequest> softwareRequests) {
        this.softwareRequests = softwareRequests;
    }

    public WorkType getWorkType() {
        return workType == null ? null : WorkType.fromId(workType);
    }

    public void setWorkType(WorkType workType) {
        this.workType = workType == null ? null : workType.getId();
    }

    public User getEmployee() {
        return employee;
    }

    public void setEmployee(User employee) {
        this.employee = employee;
    }

    public User getHrManager() {
        return hrManager;
    }

    public void setHrManager(User hrManager) {
        this.hrManager = hrManager;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}