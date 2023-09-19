package com.company.sampleprojectbpmn.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@JmixEntity
@Table(name = "DEPARTMENT", indexes = {
        @Index(name = "IDX_DEPARTMENT_COORDINATOR", columnList = "COORDINATOR_ID")
})
@Entity
public class Department {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @NotNull(message = "Please check the...")
    @InstanceName
    @Column(name = "NAME", nullable = false)
    private String name;

    @JoinColumn(name = "COORDINATOR_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private User coordinator;

    public User getCoordinator() {
        return coordinator;
    }

    public void setCoordinator(User coordinator) {
        this.coordinator = coordinator;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}