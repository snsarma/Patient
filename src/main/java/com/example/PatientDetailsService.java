package com.example;

public interface PatientDetailsService  {
 
    public PatientDetails loadUserById(Long Id) throws PatientIdNotFoundException;
	public PatientDetails loadUserByUsername(String username) throws PatientNameNotFoundException;
 
}
