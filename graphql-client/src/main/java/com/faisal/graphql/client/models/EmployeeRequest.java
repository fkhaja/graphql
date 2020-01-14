package com.faisal.graphql.client.models;

import io.aexp.nodes.graphql.annotations.GraphQLVariable;
import lombok.Data;

import java.util.List;

@Data
public class EmployeeRequest {
    @GraphQLVariable(name = "count", scalar = "Int")
    public List<Employee> employees;
}