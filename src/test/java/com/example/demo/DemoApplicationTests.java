package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.GetMapping;
import org.springframework.boot.test.context.RestController;


@SpringBootApplication
public class DemoGithubApplication {

	public static main(String[] args){
		SpringApplication.run(DemoGithubApplication.class, args);
	}
}

@RestController
class HelloWorldController{
	@GetMapping("/")
	public String sayHello(){
		return "Nuggets";
	}
}
