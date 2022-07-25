package com.cg.JwtSecurityservice.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cg.JwtSecurityservice.models.ERole;
import com.cg.JwtSecurityservice.models.Role;
 
public interface RoleRepository extends MongoRepository<Role, String> {
  Optional<Role> findByName(ERole name);
}
