package com.testapp.onboarding_service;

import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange
public interface ProcessingClient {

	@GetExchange("/processing")
	String validate();
}
