package com.usa.ri.gov.ies.admin.controller;

import org.hibernate.validator.internal.util.logging.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.usa.ri.gov.ies.constants.AppContants;
import com.usa.ri.gov.ies.properties.AppProperties;


@RestController
public class MainRestController {
	
	@Autowired(required=true)
	private AppProperties properties;
	private Logger logger=org.slf4j.LoggerFactory.getLogger(MainRestController.class);
	
	
	
	public MainRestController() {
		logger.info("MainRestController::Initialized");
	}
	@GetMapping("/welcome")
     public String wishMessageGenerate() {
		logger.info("wishMessageGenereator() method execution is stated");
		System.out.println(properties);
		String msg=properties.getProperties().get(AppContants.message);
		logger.info("wishMessageGenereator() method execution is ended");
		
    	 return msg;
     }
}
