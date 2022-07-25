package com.cg.HRService.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


//@NoArgsConstructor
//@AllArgsConstructor
//@Data
public class EmployeeInfo {
	 
	private int eid;
	private String name;
	private String gender;
	private int age;
	private double salary;
	private String departmentName;
	private String locationName;
	
	

	public EmployeeInfo(int eid, String name) {
		super();
		this.eid = eid;
		this.name = name;
	}
	
	
	public EmployeeInfo(int eid, String name, String gender, int age, double salary, String departmentName,
			String locationName) {
		super();
		this.eid = eid;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.salary = salary;
		this.departmentName = departmentName;
		this.locationName = locationName;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getLocationName() {
		return locationName;
	}
	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}
	
	
}
