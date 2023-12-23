package com.example.testJenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class TestJenkinsApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestJenkinsApplication.class, args);
	}

	@GetMapping("/")
	public String hello(){
		return "fen a toubi";
	}
}
