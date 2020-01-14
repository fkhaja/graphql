package com.faisal.graphql.server.graphql.mutation;

import com.faisal.graphql.server.graphql.service.EmployeeService;
import com.faisal.graphql.server.models.Employee;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeMutation  implements GraphQLMutationResolver {

    @Autowired
    private EmployeeService employeeService;

    public Employee createEmployee(final String firstName, final String lastName) {
        return this.employeeService.createEmployee(firstName, lastName);
    }
}
