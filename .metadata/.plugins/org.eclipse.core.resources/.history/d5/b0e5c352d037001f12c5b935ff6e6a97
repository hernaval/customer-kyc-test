package com.testapp.onboarding_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.testapp.onboarding_service.ProcessingClient;

@RestController
@RequestMapping("/customers")
public class CustomerController {
	@Autowired
	private ProcessingClient processingClient;

	@GetMapping
	public String get() {
		String validation = processingClient.validate();
		return validation;
	}
}
