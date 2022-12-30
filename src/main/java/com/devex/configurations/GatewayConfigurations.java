package com.devex.configurations;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfigurations 
{
	@Bean
	public RouteLocator msRoutes(RouteLocatorBuilder builder) 
	{
	    return builder.routes()
	    		.route(
	    				u -> u.path("/api/v1/product","/api/v1/product/*","/api/v1/product/search/*").uri("http://localhost:8041")	    				
	    			   )
	    		.build();
	}
}
