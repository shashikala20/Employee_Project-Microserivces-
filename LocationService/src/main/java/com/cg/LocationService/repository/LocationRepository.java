package com.cg.LocationService.repository;
 
import org.springframework.data.mongodb.repository.MongoRepository;

import com.cg.LocationService.entity.Location;

public interface LocationRepository extends MongoRepository<Location, Long> {

}
