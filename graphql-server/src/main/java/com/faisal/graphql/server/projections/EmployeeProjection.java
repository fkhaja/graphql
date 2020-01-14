package com.faisal.graphql.server.projections;

import com.faisal.graphql.server.models.Employee;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "employeeSmall", types = { Employee.class })
public interface EmployeeProjection {

    @Value("#{target.employeeNumber}")
    String getId();

    String getFirstName();

    @Value("#{target.supervisor != null ? target.supervisor.employeeNumber : null}")
    String getSupervisor();

//    EmployeeProjection getSupervisor();

    String getLastName();

    String getCountryCode();

    Boolean getHazMatTrained();
}
