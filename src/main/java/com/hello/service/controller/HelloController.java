package com.hello.service.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hello/v1")
public class HelloController {

	@GetMapping("/get")
	public ResponseEntity<String> sayHello() {
		return new ResponseEntity<>("Welcome to the Eureka World for servicing", HttpStatus.OK);
	}
}
