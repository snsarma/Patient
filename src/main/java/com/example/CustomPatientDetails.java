package com.example;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
 
public class CustomPatientDetails implements UserDetails {
 
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private PatientModel patientModel;
     
    public CustomPatientDetails(PatientModel PatientModel) {
        this.patientModel = PatientModel;
    }
 
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }
 
    @Override
    public String getPassword() {
        return patientModel.getPassword();
    }
 
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }
 
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }
 
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }
 
    @Override
    public boolean isEnabled() {
        return true;
    }


	@Override
	public String getUsername() {
		
		return this.patientModel.getPatientName();
	}
        
}

