package com.simplilearn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {

	@GetMapping("/users/status/")
	public String statusCheck() {
		return "users-ms is up and running..";
	}
}
