package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.Patient;
import com.example.PatientModel;
 
@Controller
public class AppController {
 
    @Autowired
    private PatientRepository patientRepo;
    
    @Autowired
    private PatientService service;
    
    
    @GetMapping("/updatePatientDetails")
    public String update(Model model) {
    	model.addAttribute("patient", new Patient());
        return "updatepatient";
    }
    
    @GetMapping("/registerPatientDetails")
    public String register(Model model) {
    	model.addAttribute("patient", new Patient());
        return "registerpatient";
    }
     
    @GetMapping("")
    public String viewHomePage() {
        return "index";
    }
    
    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("user", new Patient());
         
        return "signup_form";
    }
    
    @GetMapping("/patients")
    public String listUsers(Model model) {
    	
        List<PatientModel> listPatient = patientRepo.findAll();
        List<Patient> listPatients = new ArrayList();
        
        for(PatientModel patientModel:listPatient) {
            Patient patient = new Patient();
            patient.setSubjectId(patientModel.getSubjectId());
            patient.setGender(patientModel.getGender());
            patient.setDiseaseType(patientModel.getDiseaseType()); 	
            patient.setYearOfDiagnosis(patientModel.getYearOfDiagnosis());
            patient.setEthnicity(patientModel.getEthnicity());
            patient.setRace(patientModel.getRace());
            patient.setAge(patientModel.getAge());
            if(patientModel.getDietFitness() != null) {
            	
            	patient.setFitnessInfo(patientModel.getDietFitness().getFitnessInfo());
            	patient.setDietInfo(patientModel.getDietFitness().getDietInfo());

            	
            }
            
            listPatients.add(patient);
        }
        model.addAttribute("listPatients", listPatients);
         
        return "patients";
    }

    @PostMapping("/registerPatient")
    public String processRegister(Patient patient) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encodedPassword = passwordEncoder.encode(patient.getPassword());
        patient.setPassword(encodedPassword);
        PatientModel patientmodel = new PatientModel(); 
        patientmodel.setAge(patient.getAge());
        patientmodel.setPatientName(patient.getPatientName());
        patientmodel.setPassword(patient.getPassword());
        patientmodel.setGender(patient.getGender());
        patientmodel.setDiseaseType(patient.getDiseaseType());
        patientRepo.save(patientmodel);        
        return "patientRegistered";
    }
    
	
    @PostMapping("/updatePatient")
	public PatientModel save(Patient patient) {
		return service.updatePatient(patient);
		
	}
	
	@GetMapping("/findByPatientId")
	public PatientModel findByPatientId(@RequestParam Integer Subject_id) {
		// System.out.println("service response"+service.viewPatientById(Subject_id));
		return service.viewPatientById(Subject_id);

	 }

}

