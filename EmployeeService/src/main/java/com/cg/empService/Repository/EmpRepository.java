package com.cg.empService.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.cg.empService.entity.Employee;

@Repository
public interface EmpRepository extends MongoRepository<Employee, Long> {

}
