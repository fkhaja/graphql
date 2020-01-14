package com.faisal.graphql.server.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Task implements Serializable {

    private static final long serialVersionUID = 8513779311718220427L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long dockTaskId;

    @Column
    private Long serviceCenterId;

    @Column
    private Long manifestId;

    @Column
    private Long truckId;

    @Column
    private Long trailerId;

    @Column
    private Long taskTypeId;

    @Column
    private Long taskStatusId;

    @Column
    private Boolean isPinnedPriority;

    @Column
    private Long dockRoleId;

    @Column
    private Long dockActionTypeId;

    @Column
    private Long dockPlanTypeId;

    @Column
    private Long dockLocationId;

    private @Column
    String sourceReferenceId;

    private @Column
    LocalDateTime taskCreatedOn;

    private @Column
    Integer priorityLevel;

    private @Column
    Boolean isDeleted;

    private @Column
    Long createdBy;

    private @Column
    Timestamp createdOn;

    private @Column
    Long updatedBy;

    private @Column
    Timestamp updatedOn;
}
