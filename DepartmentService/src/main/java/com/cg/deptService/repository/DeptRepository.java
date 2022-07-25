package com.cg.deptService.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.cg.deptService.entity.Department; 

@Repository
public interface DeptRepository extends MongoRepository<Department, Long> {

}
