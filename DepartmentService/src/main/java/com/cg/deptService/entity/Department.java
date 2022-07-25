package com.cg.deptService.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "departments")
public class Department {
	
	@Id
	private Long departmentId;
	private String departmentName;
	private Long locationId;
	public Department(Long departmentId, String departmentName, Long locationId) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.locationId = locationId;
	}
	public Long getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public Long getLocationId() {
		return locationId;
	}
	public void setLocationId(Long locationId) {
		this.locationId = locationId;
	}
	
	
	
}
