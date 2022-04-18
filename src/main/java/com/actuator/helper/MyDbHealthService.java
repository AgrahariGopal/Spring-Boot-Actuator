package com.actuator.helper;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Component
public class MyDbHealthService implements HealthIndicator{

	private final String DatabaseService = "DatabaseService";
	
	public boolean isHealthCheck()
	{	
		return true;
	}
	
	@Override
	public Health health() {
		if(isHealthCheck()) {
			return Health.up().withDetail(DatabaseService, "Databse service is running").build();
		}
		
		return Health.down().withDetail(DatabaseService, "Database service is not available ").build();
	}

}
