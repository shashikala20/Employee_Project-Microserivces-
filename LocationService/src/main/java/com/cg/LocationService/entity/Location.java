package com.cg.LocationService.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "location")
public class Location {
	
	@Id
	private Long locId;
	private String locName;
	
	
	
	public Location(Long locId, String locName) {
		super();
		this.locId = locId;
		this.locName = locName;
	}
	public Long getLocId() {
		return locId;
	}
	public void setLocId(Long locId) {
		this.locId = locId;
	}
	public String getLocName() {
		return locName;
	}
	public void setLocName(String locName) {
		this.locName = locName;
	}
	
	

}
