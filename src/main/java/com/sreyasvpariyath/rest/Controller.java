package com.sreyasvpariyath.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/vi/api")
@RefreshScope
public class Controller {

	@Value("${rest.test}")
	private String property_from_config_server;
	
	@GetMapping
	public String info()
	{
		return property_from_config_server;
	}
}
