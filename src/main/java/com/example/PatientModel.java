package com.example;

import javax.persistence.*;

@Entity
@Table(name = "Patient.patient_model")
public class PatientModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer subjectId;
	private String password;
	private String patientName;
	private Integer age;
	private String gender;
	private String diseaseType;
	private String race;
	private String ethnicity;
	private Integer yearOfDiagnosis;
	
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Subject_id", referencedColumnName = "Subject_id")
    private DietFitness dietFitness;

	public DietFitness getDietFitness() {
		return dietFitness;
	}
	
	public void setDietFitness(DietFitness dietFitness) {
		this.dietFitness = dietFitness;
	}

	public PatientModel() {
		super();
	}

	public PatientModel(Integer subjectId, String password, String patientName, Integer age, String gender,
			String diseaseType, String race, String ethnicity, Integer yearOfDiagnosis) {
		super();
		this.subjectId = subjectId;
		this.password = password;
		this.patientName = patientName;
		this.age = age;
		this.gender = gender;
		this.diseaseType = diseaseType;
		this.race = race;
		this.ethnicity = ethnicity;
		this.yearOfDiagnosis = yearOfDiagnosis;
	}
	
	public Integer getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(Integer subjectId) {
		this.subjectId = subjectId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}	
	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDiseaseType() {
		return diseaseType;
	}

	public void setDiseaseType(String diseaseType) {
		this.diseaseType = diseaseType;
	}


	public String getRace() {
		return race;
	}


	public void setRace(String race) {
		this.race = race;
	}
	public String getEthnicity() {
		return ethnicity;
	}


	public void setEthnicity(String ethnicity) {
		this.ethnicity = ethnicity;
	}

	public Integer getYearOfDiagnosis() {
		return yearOfDiagnosis;
	}


	public void setYearOfDiagnosis(Integer yearOfDiagnosis) {
		this.yearOfDiagnosis = yearOfDiagnosis;
	}

}
