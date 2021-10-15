package com.example;


import org.springframework.stereotype.Service;

import com.example.Patient;
import com.example.PatientModel;

@Service
public interface PatientService {
		
	public PatientModel updatePatient(Patient patient);
	public PatientModel viewPatientById(Integer subjectId);	
	//public PatientModel viewPatientByGender(String gender);	


}