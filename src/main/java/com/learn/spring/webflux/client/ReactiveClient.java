package com.learn.spring.webflux.client;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Mono;

public class ReactiveClient {

	public static void main(String [] args) throws InterruptedException {
		WebClient client = WebClient.create("http://localhost:8080");
		
		Mono<String> response = client.get().uri("/reactive/{name}", "Shantanu").retrieve().bodyToMono(String.class);
		response.subscribe(System.out::println);
		System.out.println("Done !!");
		TimeUnit.SECONDS.sleep(10);
	}
}
