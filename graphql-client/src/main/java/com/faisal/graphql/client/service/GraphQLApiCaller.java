package com.faisal.graphql.client.service;

import com.faisal.graphql.client.models.Employee;
import com.faisal.graphql.client.models.EmployeeRequest;
import io.aexp.nodes.graphql.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.net.MalformedURLException;
import java.util.List;

@Service
public class GraphQLApiCaller {

    @Autowired
    private GraphQLTemplate graphQLTemplate;

    @Value("${graphql.server.url}")
    private String url;

    public List<Employee> getEmployees(Integer count) throws MalformedURLException {
//        GraphQLTemplate graphQLTemplate = new GraphQLTemplate();
        GraphQLRequestEntity requestEntity = GraphQLRequestEntity.Builder()
                .url(url)
                .variables(new Variable("count", count))
                .request(EmployeeRequest.class)
                .build();
        GraphQLResponseEntity<EmployeeRequest> responseEntity = graphQLTemplate.query(requestEntity, EmployeeRequest.class);
        System.out.println(((GraphQLResponseEntity) responseEntity).getResponse());
        return responseEntity.getResponse().getEmployees();
    }
}
