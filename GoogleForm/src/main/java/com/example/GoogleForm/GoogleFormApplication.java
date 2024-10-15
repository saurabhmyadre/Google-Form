package com.example.GoogleForm;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
public class GoogleFormApplication {

	public static void main(String[] args) {
		SpringApplication.run(GoogleFormApplication.class, args);
		System.out.println("Applucation started");
	}

}
