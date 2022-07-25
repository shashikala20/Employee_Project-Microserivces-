package com.cg.HRService.client;

import java.util.List;
import java.util.Optional;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.cg.HRService.model.Employee; 

@FeignClient(url="http://localhost:9001",name="emp-service")
public interface EmployeeFeignClient {

	@GetMapping("/getAll")
	public List<Employee> getAllEmp();
	
	@GetMapping("/getById/{empId}")
	public Optional<Employee> getEmployee(@PathVariable Long empId) ;
}


