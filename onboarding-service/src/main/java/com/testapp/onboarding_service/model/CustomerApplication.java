package com.testapp.onboarding_service.model;

import java.time.Instant;
import java.time.LocalDate;
import java.util.Set;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class CustomerApplication {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String purpose;
	private String companyName;
	private String entityType;
	private String businessActivity;
	private String licenseRequirements;
	private String countryOfIncorporation;
	private String registrationNumber;
	@Temporal(TemporalType.DATE)
	private LocalDate incorporationDate;
	private String directorName;
	private String directorPassportNumber;
	private String applicantName;
	private String emailAddress;
	@CreationTimestamp
	private Instant createdAt;
	@UpdateTimestamp
	private Instant updatedAt;
	
	@OneToMany(mappedBy = "customerApplication")
	private Set<Document> documents;
	
	public CustomerApplication() {
		super();
	}

	public CustomerApplication(Long id, String purpose, String companyName, String entityType, String businessActivity,
			String licenseRequirements, String countryOfIncorporation, String registrationNumber,
			LocalDate incorporationDate, String directorName, String directorPassportNumber, String applicantName,
			String emailAddress) {
		this.id = id;
		this.purpose = purpose;
		this.companyName = companyName;
		this.entityType = entityType;
		this.businessActivity = businessActivity;
		this.licenseRequirements = licenseRequirements;
		this.countryOfIncorporation = countryOfIncorporation;
		this.registrationNumber = registrationNumber;
		this.incorporationDate = incorporationDate;
		this.directorName = directorName;
		this.directorPassportNumber = directorPassportNumber;
		this.applicantName = applicantName;
		this.emailAddress = emailAddress;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getEntityType() {
		return entityType;
	}

	public void setEntityType(String entityType) {
		this.entityType = entityType;
	}

	public String getBusinessActivity() {
		return businessActivity;
	}

	public void setBusinessActivity(String businessActivity) {
		this.businessActivity = businessActivity;
	}

	public String getLicenseRequirements() {
		return licenseRequirements;
	}

	public void setLicenseRequirements(String licenseRequirements) {
		this.licenseRequirements = licenseRequirements;
	}

	public String getCountryOfIncorporation() {
		return countryOfIncorporation;
	}

	public void setCountryOfIncorporation(String countryOfIncorporation) {
		this.countryOfIncorporation = countryOfIncorporation;
	}

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public LocalDate getIncorporationDate() {
		return incorporationDate;
	}

	public void setIncorporationDate(LocalDate incorporationDate) {
		this.incorporationDate = incorporationDate;
	}

	public String getDirectorName() {
		return directorName;
	}

	public void setDirectorName(String directorName) {
		this.directorName = directorName;
	}

	public String getDirectorPassportNumber() {
		return directorPassportNumber;
	}

	public void setDirectorPassportNumber(String directorPassportNumber) {
		this.directorPassportNumber = directorPassportNumber;
	}

	public String getApplicantName() {
		return applicantName;
	}

	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public Instant getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Instant createdAt) {
		this.createdAt = createdAt;
	}

	public Instant getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Instant updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Set<Document> getDocuments() {
		return documents;
	}

	public void setDocuments(Set<Document> documents) {
		this.documents = documents;
	}

	
	
}
