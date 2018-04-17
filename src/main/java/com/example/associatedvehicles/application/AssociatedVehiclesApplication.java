package com.example.associatedvehicles.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.example.associatedvehicles")
public class AssociatedVehiclesApplication {

	public static void main(String[] args) {
		SpringApplication.run(AssociatedVehiclesApplication.class, args);
	}
}
