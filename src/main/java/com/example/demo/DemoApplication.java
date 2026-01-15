package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotaion.GetMapping;
import org.spirngframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

@RestController
	class HelloWorldController {
		@GetMapping("/")
		public String sayHello() {
			return "Nuggets";
		}

}
