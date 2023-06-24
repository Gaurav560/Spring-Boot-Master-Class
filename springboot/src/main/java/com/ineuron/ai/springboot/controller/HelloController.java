package com.ineuron.ai.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	
	@GetMapping("/")
	public String helloWorld() {
		return "Welcome to the jungle";
	}
}
