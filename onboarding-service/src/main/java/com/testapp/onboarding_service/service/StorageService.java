package com.testapp.onboarding_service.service;

import org.springframework.web.multipart.MultipartFile;

public interface StorageService {
	void saveFiles(MultipartFile[] files) throws Exception;
}
