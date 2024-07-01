package com.testapp.onboarding_service.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.testapp.onboarding_service.model.CustomerApplication;

public interface CustomerApplicationService {
	CustomerApplication save(CustomerApplication customerApplicationDto, MultipartFile[] files);

	CustomerApplication findById(Long id);

	List<CustomerApplication> findAll();
}
