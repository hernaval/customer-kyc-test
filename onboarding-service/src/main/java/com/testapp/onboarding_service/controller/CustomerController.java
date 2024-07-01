package com.testapp.onboarding_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.testapp.onboarding_service.ProcessingClient;
import com.testapp.onboarding_service.dto.CustomerApplicationDto;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name="Customer onboarding application")
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
	
	@PostMapping
	@Operation(summary="Send customer details data")
	public ResponseEntity<?> receiveApplication(@RequestParam("files") MultipartFile[] files, CustomerApplicationDto customerData) {
		
		return new ResponseEntity<>(null);
	}
}
