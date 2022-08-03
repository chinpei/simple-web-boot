package com.example.simple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.simple.controller")
public class SimpleWebBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleWebBootApplication.class, args);
	}

}
