package com.example.JobTrialPortal.repository;

import com.example.JobTrialPortal.model.Applicant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ApplicantRepo extends JpaRepository<Applicant, Long> {

}
