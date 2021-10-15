package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PatientServiceImpl implements PatientService{
	
	@Autowired
	PatientRepository patientRepo ;

	@Override
	public PatientModel updatePatient(Patient patient) {
		// TODO Auto-generated method stub
		PatientModel patientModel = new PatientModel();
		DietFitness dietFitness = new DietFitness();
		patientModel = patientRepo.findBySubjectId(patient.getSubjectId()).get(0);
		patientModel.setAge(patient.getAge());
		patientModel.setGender(patient.getGender());
		patientModel.setDiseaseType(patient.getDiseaseType());
		patientModel.setEthnicity(patient.getEthnicity());
		patientModel.setRace(patient.getRace());
        patientModel.setYearOfDiagnosis(patient.getYearOfDiagnosis());
        patientModel.setSubjectId(patient.getSubjectId());
        dietFitness.setDietInfo(patient.getDietInfo());
        dietFitness.setFitnessInfo(patient.getFitnessInfo());
        dietFitness.setSubjectId(patient.getSubjectId());
        patientModel.setDietFitness(dietFitness);
		return patientRepo.save(patientModel);
	}

	@Override
	public PatientModel viewPatientById(Integer subjectId) {
		return patientRepo.findBySubjectId(subjectId).get(0);
	}
	
	/*@Override
	public PatientModel viewPatientByGender(String gender) {
		return patientRepo.viewPatientByGender(subjectId).get(0);

	}*/


}

