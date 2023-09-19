package com.company.sampleprojectbpmn.entity;

import io.jmix.core.DeletePolicy;
import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.entity.annotation.OnDeleteInverse;
import io.jmix.core.metamodel.annotation.JmixEntity;

import javax.persistence.*;
import java.util.UUID;

@JmixEntity
@Table(name = "SOFTWARE_REQUEST", indexes = {
        @Index(name = "IDX_SOFTWARE_REQUEST_SOFTWARE", columnList = "SOFTWARE_ID"),
        @Index(name = "IDX_SOFTWAREREQU_WORKSPACEREQ", columnList = "WORKSPACE_REQUEST_ID")
})
@Entity
public class SoftwareRequest {

    @Id
    @Column(name = "ID", nullable = false)
    @JmixGeneratedValue
    private UUID id;

    @JoinColumn(name = "SOFTWARE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Software software;

    @Column(name = "PERMISSION_GRANTED")
    private Boolean permissionGranted;

    @Column(name = "SOFT_VALUE")
    private Integer softValue;

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @JoinColumn(name = "WORKSPACE_REQUEST_ID", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private WorkspaceRequest workspaceRequest;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public WorkspaceRequest getWorkspaceRequest() {
        return workspaceRequest;
    }

    public void setWorkspaceRequest(WorkspaceRequest workspaceRequest) {
        this.workspaceRequest = workspaceRequest;
    }

    public Integer getSoftValue() {
        return softValue;
    }

    public void setSoftValue(Integer softValue) {
        this.softValue = softValue;
    }

    public Boolean getPermissionGranted() {
        return permissionGranted;
    }

    public void setPermissionGranted(Boolean permissionGranted) {
        this.permissionGranted = permissionGranted;
    }

    public Software getSoftware() {
        return software;
    }

    public void setSoftware(Software software) {
        this.software = software;
    }

}