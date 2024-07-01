package com.testapp.onboarding_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.testapp.onboarding_service.model.CustomerApplication;
import com.testapp.onboarding_service.service.CustomerApplicationService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name="Customer onboarding application")
@RestController
@RequestMapping("/customers")
public class CustomerController {

	@Autowired
	CustomerApplicationService service;
	
	@GetMapping
	@Operation(summary="Get all customer application")
	public ResponseEntity<?> retrieveAllApplications() {
		return ResponseEntity.ok(service.findAll());
	}
	
	@GetMapping("{id}")
	@Operation(summary="Get a customer application")
	public ResponseEntity<?> retrieveApplication(@PathVariable("id") Long id) {
		return ResponseEntity.ok(service.findById(id));
	}
	
	@PostMapping
	@Operation(summary="Send customer data for application")
	public ResponseEntity<?> receiveApplication(@RequestParam("files") MultipartFile[] files, CustomerApplication customerData) {
		service.save(customerData, files);
		return ResponseEntity.ok("ok");
	}
}
