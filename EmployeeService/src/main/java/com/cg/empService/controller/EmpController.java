package com.cg.empService.controller;

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
import com.cg.empService.Repository.EmpRepository;
import com.cg.empService.client.AuthClient;
import com.cg.empService.entity.Employee; 

@RestController 
public class EmpController {
	
	@Autowired
	private EmpRepository empRepository;
	 
	@Autowired
	AuthClient authClient;
	
//	@GetMapping("/getAll")
//	public List<Employee> getAllEmp(){ 
//		return empRepository.findAll();
//				} 
//	
	@GetMapping("/getById/{empId}")
	public Optional<Employee> getEmployee(@PathVariable Long empId) { 
		return empRepository.findById(empId);
	}
	
//	@GetMapping("/getById/{empId}")
//	public ResponseEntity<Optional<Employee>> getEmployeeById(@PathVariable("empId") Long empId, @RequestHeader("Authorization") String token){
//		if (!authClient.getValidity(token).isValid()) {
//
//			return new ResponseEntity("Token is either expired or invalid...", HttpStatus.FORBIDDEN);
//		}
//		ResponseEntity<Employee> emp=  new ResponseEntity<>(empRepository.findById(empId), HttpStatus.OK);
//		return emp;
//	} 
	
	 
	
	@GetMapping("/getAll")
	public ResponseEntity<List<Employee>> getEmployee(@RequestHeader("Authorization") String token){
		if (!authClient.getValidity(token).isValid()) {

			return new ResponseEntity("Token is either expired or invalid...", HttpStatus.FORBIDDEN);
		}
		ResponseEntity<List<Employee>>	emp=  new ResponseEntity<>(empRepository.findAll(), HttpStatus.OK);
		return emp;
	} 
	
	
	 @PostMapping("/add")
	    public Employee addEmployee(@RequestBody Employee newEmp) {
	        return empRepository.save(newEmp);
	 }
	 
}
