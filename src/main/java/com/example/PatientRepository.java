package com.example;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PatientRepository extends JpaRepository<PatientModel, Long> {
	
	@Query("SELECT u FROM PatientModel u WHERE u.patientName = ?1")
	PatientModel getByPatientName(String patientName);
	
	List<PatientModel> findBySubjectId(Integer subjectId);
	  //  List<PatientModel> viewPatientByGender(String gender);

	    @SuppressWarnings("unchecked")
		PatientModel save(PatientModel patient);
	 
}

