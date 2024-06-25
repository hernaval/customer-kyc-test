package com.testapp.processing_service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/processing")
public class ProcessingController {

	@GetMapping
	public String validate() {
		return "In progress...";
	}
}
