package com.cg.HRService.controller;

import java.util.List;
import java.util.Optional; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.HRService.client.DepartmentFeignClient;
import com.cg.HRService.client.EmployeeFeignClient;
import com.cg.HRService.client.LocationFeignClient;
import com.cg.HRService.model.Department;
import com.cg.HRService.model.Employee;
import com.cg.HRService.model.Location; 

@RestController
@RequestMapping("/hr")
@EnableFeignClients(basePackages = "com.cg.HRService.client")
public class HRController {

	@Autowired
	EmployeeFeignClient employeeFeignClient;

	@Autowired 
	DepartmentFeignClient departmentFeignClient;
	
	@Autowired
	LocationFeignClient locationFeignClient;

	@GetMapping("/allEmp")
	public List<Employee> getAllEmp(){ 
		return employeeFeignClient.getAllEmp();
				}
	
	@GetMapping("/empById/{empId}")
	public Optional<Employee> getEmployee(@PathVariable Long empId) { 
		return employeeFeignClient.getEmployee(empId);
	}
	
	@GetMapping("/departments")
	public List<Department> getAllDepartments(){ 
		return departmentFeignClient.getAllDepartments();
	}
	
	@GetMapping("/getDeptById/{deptId}")
	public Optional<Department> getDepartment(@PathVariable Long deptId) { 
		return departmentFeignClient.getDepartment(deptId) ;
	}
	
	@GetMapping("/getLocation")
	public List<Location>  getAllLocation() { 
		return locationFeignClient.getAllLocation(); 
	} 
	
	@GetMapping("/location/{locId}")
	public Optional<Location> getLocation(@PathVariable("locId") Long Id) {
		return locationFeignClient.getLocation(Id); 
	}
	
}

















