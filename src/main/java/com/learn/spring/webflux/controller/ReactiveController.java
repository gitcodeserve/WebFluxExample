package com.learn.spring.webflux.controller;

import java.util.concurrent.TimeUnit;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;
@RestController
public class ReactiveController {
	
	@GetMapping("/reactive/{name}")
	private Mono<String> getEmployeeById(@PathVariable String name) throws InterruptedException {
		String [] str = {"abc", "pqr", "xyz"};
		TimeUnit.MILLISECONDS.sleep(5000);
	    return Mono.just("Hello reactive " + name);
	}

}
