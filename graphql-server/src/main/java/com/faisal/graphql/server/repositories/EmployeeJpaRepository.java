package com.faisal.graphql.server.repositories;

import com.faisal.graphql.server.models.Employee;
import com.faisal.graphql.server.projections.EmployeeProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

//@RepositoryRestResource
@Repository
public interface EmployeeJpaRepository extends JpaRepository<Employee, Long> {
    List<EmployeeProjection> findAllProjectionsBy();

}
