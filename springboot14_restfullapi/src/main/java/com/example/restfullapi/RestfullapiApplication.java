package com.example.restfullapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.example.controller")
@SpringBootApplication
public class RestfullapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestfullapiApplication.class, args);
	}

}
