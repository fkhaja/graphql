package com.faisal.graphql.server.graphql.query;

import com.faisal.graphql.server.graphql.service.EmployeeService;
import com.faisal.graphql.server.models.Employee;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class EmployeeQuery implements GraphQLQueryResolver {

    @Autowired
    private EmployeeService employeeService;

    public List<Employee> getEmployees(final int count) {
        return this.employeeService.getAllEmployees(count);
    }

    public Optional<Employee> getEmployee(final long id) {
        return this.employeeService.getEmployee(id);
    }
}
