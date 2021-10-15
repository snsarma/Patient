package com.example;

public class Patient {

	private Integer subjectId;
	private String password;
	private String patientName;
	private Integer age;
	private String gender;
	private String diseaseType;
	private String race;
	private String ethnicity;
	private Integer yearOfDiagnosis;
	private String dietInfo;
	private String fitnessInfo;
	
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
	public void setSubjectId(Integer subjectId) {
		this.subjectId = subjectId;
	}
	public Integer getSubjectId() {
		return subjectId;
	}
	public void setSubject_Id(Integer subjectId) {
		this.subjectId = subjectId;
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

}
