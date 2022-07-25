package com.cg.deptService.controller;  

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.cg.deptService.client.AuthClient;
import com.cg.deptService.entity.Department;
import com.cg.deptService.repository.DeptRepository; 

@RestController
//@RequestMapping("/dept")
public class deptController {
	 
	@Autowired	
	private DeptRepository deptRepository;
	
	@Autowired
	AuthClient authClient;
	 
	@GetMapping("/deptById/{deptId}")
	public Optional<Department> getDepartment(@PathVariable Long deptId) { 
		return deptRepository.findById(deptId) ;
	}
	
	
	@GetMapping("/getAllDept")
	public ResponseEntity<List<Department>> getAllDepartments(@RequestHeader("Authorization") String token){
		if (!authClient.getValidity(token).isValid()) {

			return new ResponseEntity("Token is either expired or invalid...", HttpStatus.FORBIDDEN);
		}
		ResponseEntity<List<Department>>	dept=  new ResponseEntity<>(deptRepository.findAll(), HttpStatus.OK);
		return dept;
	} 
	 
//	
//	public List<Department> getAllDepartments(){ 
//		return deptRepository.findAll();
//	}
	
	
	
	@PostMapping("/addDept")
	public Department addDepartment(@RequestBody Department newDept) {
		return deptRepository.save(newDept);
		
	}
}

