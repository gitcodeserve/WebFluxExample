package com.learn.spring.webflux;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan ({"com.learn.spring.webflux"})
public class WebFluxExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebFluxExampleApplication.class, args);
	}
}
