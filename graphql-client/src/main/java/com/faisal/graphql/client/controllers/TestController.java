package com.faisal.graphql.client.controllers;


import com.faisal.graphql.client.models.Employee;
import com.faisal.graphql.client.service.GraphQLApiCaller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.net.MalformedURLException;
import java.util.List;

@RestController
public class TestController {

//    private static final String template = "Hello, %s!";
//    private final AtomicLong counter = new AtomicLong();

    @Autowired
    GraphQLApiCaller graphQLApiCaller;

    @GetMapping("/test")
    public Employee greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        Employee emp = new Employee();
        emp.setActive(true);
        return emp;
    }

    @GetMapping("/emp")
    public List<Employee> getEmployees(@RequestParam(defaultValue = "5") int count) throws MalformedURLException {
        return graphQLApiCaller.getEmployees(count);
    }
}
