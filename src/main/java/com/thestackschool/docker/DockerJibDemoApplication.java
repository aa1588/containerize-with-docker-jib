package com.thestackschool.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerJibDemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(DockerJibDemoApplication.class, args);
	}

	@GetMapping("/")
	public String hello(){
		return "welcome to THE STACK SCHOOL";
	}






















	public void main(){

	}
}
