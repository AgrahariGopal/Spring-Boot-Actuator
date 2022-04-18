package com.actuator.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

@Endpoint(id="custom")
@Component
public class CustomActuatorEndpoint {

	@ReadOperation
	public Map<String ,String> customEndpoint()
	{
		Map<String ,String> map = new HashMap<>();
		map.put("Office", "Noida");
		map.put("Name", "Gopal Agrahari");
		return map;
	}
}
