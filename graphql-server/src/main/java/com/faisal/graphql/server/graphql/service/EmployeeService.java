package com.faisal.graphql.server.graphql.service;

import com.faisal.graphql.server.graphql.repository.EmployeeRepository;
import com.faisal.graphql.server.models.Employee;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(final EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Transactional
    public Employee createEmployee(final String firstName, final String lastName) {
        final Employee employee = new Employee();
        employee.setFirstName(firstName);
        employee.setLastName(lastName);
        return this.employeeRepository.save(employee);
    }

    @Transactional(readOnly = true)
    public List<Employee> getAllEmployees(final int count) {
        return this.employeeRepository.findAll().stream().limit(count).collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public Optional<Employee> getEmployee(final long id) {
        return this.employeeRepository.findById(id);
    }
}
