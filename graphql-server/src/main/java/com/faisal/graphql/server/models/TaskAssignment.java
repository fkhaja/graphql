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
public class TaskAssignment implements Serializable {

    private static final long serialVersionUID = 2363594670485531099L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    Long taskAssignmentId;

    @Column
    Long dockTaskId;

    @Column
    Long employeeNumber;

    @Column
    Long sequenceNumber;

    @Column
    Long assignedByEmployeeNumber;

    @Column
    LocalDateTime startDateTime;

    @Column
    LocalDateTime endDateTime;

    @Column
    LocalDateTime assignedDateTime;

    @Column
    Boolean isDeleted;

    @Column
    Long createdBy;

    @Column
    Timestamp createdOn;

    @Column
    Long updatedBy;

    @Column
    Timestamp updatedOn;
}
