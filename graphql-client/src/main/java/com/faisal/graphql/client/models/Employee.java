package com.faisal.graphql.client.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Employee {
    private Boolean active;
    private String firstName;
    private String middleName;
    private String lastName;
    private String countryCode;
    private Boolean hazMatTrained;

    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy[-]MM[-]dd'T'HH[:]mm")
    private LocalDateTime birthDate;
    
    // bug in nodes library. Doesn't support recursive nested objects yet
//    private Employee supervisor;
}
