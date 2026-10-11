package com.vcube.helloworldapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Project1 {

	@RequestMapping("/project1")
	String proj() {
		
		return "Hey,This is Your First project";
		
	}
	
}
