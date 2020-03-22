package com.learn.spring.webflux.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NonReactiveController {

	@GetMapping (value = "/hello")
	public String nonReactive() {
		return "I am a non-reative API ... ";
	}
}
