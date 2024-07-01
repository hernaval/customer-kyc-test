package com.testapp.onboarding_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.testapp.onboarding_service.model.Document;

@Repository
public interface DocumentRepository extends JpaRepository<Document, Long> {

}
