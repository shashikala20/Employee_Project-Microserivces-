package com.cg.apiGetWay;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class MyGatewayRoute {
 
	@Bean
	public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
		
		return builder.routes()
				.route(r->r.path("/emp/**")
				.uri("http://localhost:9001"))
				.route(r->r.path("/dept/**")
				.uri("http://localhost:9002"))
				.route(r->r.path("/loc/**")
				.uri("http://localhost:9003"))
				.build();
				
	}
}
