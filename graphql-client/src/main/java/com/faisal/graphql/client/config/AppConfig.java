package com.faisal.graphql.client.config;

import io.aexp.nodes.graphql.GraphQLTemplate;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {

    @Bean
    public RestTemplate customRestTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    @Bean
    public GraphQLTemplate graphQLTemplate() {
        return new GraphQLTemplate();
    }
}
