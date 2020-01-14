package com.faisal.graphql.server.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee implements Serializable {

    private static final long serialVersionUID = -1032340578855423192L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long employeeNumber;

    @Column
    private Long employeeType;

//    @Column
//    private Long supervisorEmployeeNumber;

    @NotFound(action = NotFoundAction.IGNORE)
    @ManyToOne
//    @JsonIgnore
    @JoinColumn(name = "supervisorEmployeeNumber")
    private Employee supervisor;

    @Column
    private Long serviceCenterId;

    @Column
    private String employeeCode;

    @Column
    private String genderCode;

    @Column
    private String ethnicityDesc;

    @Column
    private String maritalStatusCode;

    @Column
    private String badgeCode;

    @Column
    private LocalDateTime originalHireDate;

    @Column
    private LocalDateTime rehireDate;

    @Column
    private LocalDateTime terminationDate;

    @Column
    private Boolean active = false;

    @Column
    private String firstName;

    @Column
    private String middleName;

    @Column
    private String lastName;

    @Column
    private String suffixCode;

    @Column
    private String prefixCode;

    @Column
    private String addressLine1;

    @Column
    private String addressLine2;

    @Column
    private String city;

    @Column
    private String stateProvinceCode;

    @Column
    private String postalCode;

    @Column
    private String countryCode;

    @Column
    private String homePhoneNumber;

    @Column
    private String mobilePhoneNumber;

    @Column
    private String workPhoneNumber;

    @Column
    private String workPhoneExtensionNumber;

    @Column
    private String employeeTitleDescription;

    @Column
    private String emergencyContactName;

    @Column
    private String emergencyContactPhoneNumber;

    @Column
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonFormat(pattern = "yyyy[-]MM[-]dd'T'HH[:]mm[:]ss")
    private LocalDateTime birthDate;

    @Column
    private Boolean hazMatTrained = false;

}
