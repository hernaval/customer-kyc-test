package com.testapp.onboarding_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class OnboardingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnboardingServiceApplication.class, args);
	}

}
