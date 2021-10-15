package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

public class CustomPatientDetailsService implements UserDetailsService {
 
	@Autowired
	PatientRepository patientrepository;
	
	/*@Override
    public PatientDetails loadUserById(Long Id) throws PatientIdNotFoundException {
		PatientModel patientModel =patientrepository.getById(Id);
		PatientDetails patientDetails = new PatientDetails();
		patientDetails.setSubject_Id(patientModel.getSubjectId());
		return patientDetails;
	}*/
	
	@Override
	public UserDetails loadUserByUsername(String patientName) /*throws PatientNameNotFoundException*/ {
		PatientModel patientModel =patientrepository.getByPatientName(patientName);
				PatientDetails patientDetails = new PatientDetails();
		patientDetails.setSubject_Id(patientModel.getSubjectId());
		return new CustomPatientDetails(patientModel);
	}
 
}
