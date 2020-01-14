package com.faisal.graphql.server.controllers;

import com.faisal.graphql.server.models.Employee;
import com.faisal.graphql.server.projections.EmployeeProjection;
import com.faisal.graphql.server.repositories.EmployeeJpaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/v1")
public class EmployeeController {
    EmployeeJpaRepository employeeJpaRepository;

    private static final Logger LOG = LoggerFactory.getLogger(EmployeeController.class);

    EmployeeController(EmployeeJpaRepository employeeJpaRepository) {
        this.employeeJpaRepository = employeeJpaRepository;
    }

    @GetMapping("/employees/{id}")
    public Employee getEmployeeById(@PathVariable Long id) {
        return employeeJpaRepository.findById(id).get();
    }

    @GetMapping("/employees/{id}/size")
    public int getEmployeeByIdSize(@PathVariable Long id) {
        return employeeJpaRepository.findById(id).get().toString().length();
    }

    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
        return employeeJpaRepository.findAll();
    }

    @GetMapping("/employeeProjections")
    public List<EmployeeProjection> getAllEmployeeProjections() {
        return employeeJpaRepository.findAllProjectionsBy();
    }

    @PostMapping("/employees")
    public Employee createOrSaveEmployee(@RequestBody Employee employee) {
        return employeeJpaRepository.save(employee);
    }

    @DeleteMapping("/employees/{id}")
    public void deleteEmployee(@PathVariable Long id) {
        employeeJpaRepository.deleteById(id);
    }


}
