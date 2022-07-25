package com.cg.empService.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "employee")
public class Employee {
	
	@Id
	private Long empId;
	private String name;
	private Long deptId; 
	
	public Employee(Long empId, String name, Long deptId) {
		super();
		this.empId = empId;
		this.name = name;
		this.deptId = deptId; 
	}
	public Long getEmpId() {
		return empId;
	}
	public void setEmpId(Long empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getDeptId() {
		return deptId;
	}
	public void setDeptId(Long deptId) {
		this.deptId = deptId;
	} 
	
	
	
}
