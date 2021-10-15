package com.example;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "DietFitness")
public class DietFitness {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer subjectId;
	private String dietInfo;
	private String fitnessInfo;
	
	@OneToOne(mappedBy = "dietFitness")
	private PatientModel patientModel ;

	
	public PatientModel getPatientModel() {
		return patientModel;
	}
	public void setPatientModel(PatientModel patientModel) {
		this.patientModel = patientModel;
	}
	public Integer getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(Integer subjectId) {
		this.subjectId = subjectId;
	}
	public String getDietInfo() {
		return dietInfo;
	}
	public void setDietInfo(String dietInfo) {
		this.dietInfo = dietInfo;
	}
	public String getFitnessInfo() {
		return fitnessInfo;
	}
	public void setFitnessInfo(String fitnessInfo) {
		this.fitnessInfo = fitnessInfo;
	}


}
