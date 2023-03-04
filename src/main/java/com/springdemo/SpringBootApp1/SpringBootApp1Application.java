package com.springdemo.SpringBootApp1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringBootApp1Application {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootApp1Application.class, args);
	}
}
