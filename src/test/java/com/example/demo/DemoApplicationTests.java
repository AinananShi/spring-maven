package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.GetMapping;
import org.springframework.boot.test.context.RestController;


@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
	}

	@RestController
	class HelloWorldController{
		@GetMapping("/")
		public String sayHello(){
			return "Nuggets";
		}
}
