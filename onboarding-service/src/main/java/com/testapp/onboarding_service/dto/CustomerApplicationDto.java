package com.testapp.onboarding_service.dto;

import java.time.LocalDate;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record CustomerApplicationDto( 
		@NotBlank
		String purpose,
		@NotBlank
		String companyName,
		@NotBlank
		String entityType,
		@NotBlank
		String businessActivity,
		String licenseRequirements,
		@NotBlank
		String countryOfIncorporation,
		@NotBlank
		String registrationNumber,
		LocalDate incorporationDate,
		@NotBlank
		String directorName,
		@NotBlank
		@Pattern(regexp = "^[a-zA-Z0-9]{9}$")
		String directorPassportNumber,
		@NotBlank
		String applicantName,
		@Email
		String email) {

}
