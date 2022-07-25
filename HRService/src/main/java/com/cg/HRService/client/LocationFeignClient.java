package com.cg.HRService.client;

import java.util.List;
import java.util.Optional;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.cg.HRService.model.Location;

@FeignClient(url="http://localhost:9003",name="loc-service")
public interface LocationFeignClient {

	@GetMapping("/loc")
	public List<Location> getAllLocation();
	
	@GetMapping("/loc/{locId}")
	public Optional<Location> getLocation(@PathVariable("locId") Long Id);
}
