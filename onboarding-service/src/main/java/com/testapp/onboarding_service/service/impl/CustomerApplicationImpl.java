package com.testapp.onboarding_service.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.testapp.onboarding_service.exceptions.CustomerApplicationNotFoundException;
import com.testapp.onboarding_service.exceptions.ExistingCustomerException;
import com.testapp.onboarding_service.model.CustomerApplication;
import com.testapp.onboarding_service.repository.CustomerApplicationRepository;
import com.testapp.onboarding_service.service.CustomerApplicationService;
import com.testapp.onboarding_service.service.StorageService;

import jakarta.transaction.Transactional;

@Service
public class CustomerApplicationImpl implements CustomerApplicationService {
	private static final Logger LOGGER = LoggerFactory.getLogger(CustomerApplicationImpl.class);

	@Autowired
	private CustomerApplicationRepository repository;
	
	@Autowired
	private StorageService storage;

	
	@Transactional
	@Override
	public CustomerApplication save(final CustomerApplication customerApplication, MultipartFile[] files) {
		LOGGER.info("==> save customerApplication {} with documents {}", customerApplication, files);
		
		boolean applicationExists = repository.existsByEmail(customerApplication.getEmailAddress());
		if(applicationExists) {
			LOGGER.info("A customer application already exists, no need to process");
			throw new ExistingCustomerException("A customer application already exists with email: "+customerApplication.getEmailAddress());
		}
		
		try {
			storage.saveFiles(files);
		} catch (Exception e) {
			LOGGER.error("<== error during upload file");
		}
		
		CustomerApplication newApplication = repository.save(customerApplication);
		
		return newApplication;
	}


	@Override
	public CustomerApplication findById(Long id) {
		return repository.findById(id).orElseThrow(CustomerApplicationNotFoundException::new);
	}


	@Override
	public List<CustomerApplication> findAll() {
		return repository.findAll();
	}
	
	

}
