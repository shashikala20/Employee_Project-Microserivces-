package com.cg.HRService.client;

import java.util.List;
import java.util.Optional;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.cg.HRService.model.Department;
 

@FeignClient(url="http://localhost:9002", name="dept-service")
public interface DepartmentFeignClient {
	
	@GetMapping("/deptById/{deptId}")
	public Optional<Department> getDepartment(@PathVariable Long deptId) ;
		
	
	@GetMapping("/getAllDept")
	public List<Department> getAllDepartments();
}
