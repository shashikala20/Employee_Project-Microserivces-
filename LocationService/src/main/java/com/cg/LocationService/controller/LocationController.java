package com.cg.LocationService.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.LocationService.entity.Location;
import com.cg.LocationService.repository.LocationRepository; 

@RestController
//@RequestMapping("/loc")
public class LocationController {
	 
	@Autowired
	private LocationRepository locationRepository;
	 
	@GetMapping("/loc")
	public List<Location>  getAllLocation() { 
		return locationRepository.findAll();
		
	}
	
	@GetMapping("/loc/{locId}")
	public Optional<Location> getLocation(@PathVariable("locId") Long Id) {
		return locationRepository.findById(Id);
	}
	
	@PostMapping("/loc/addLocation")
	public Location addLocation(@RequestBody Location newlocation) {
		return locationRepository.save(newlocation);
	}
	
	
}
