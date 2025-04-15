package com.example.IntelliSOFT_backend.service;

import com.example.IntelliSOFT_backend.model.Patient;
import com.example.IntelliSOFT_backend.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//Encapsulates business logic and interact with the business logic
@Service
public class PatientService {

    private final PatientRepository patientRepository;

    @Autowired
    public PatientService(PatientRepository patientRepository){
        this.patientRepository = patientRepository;
    }

    public List<Patient> getAllPatients(){
        return patientRepository.findAll();
    }


    public Optional<Patient> createPatient(Patient patient) {
        boolean exists = patientRepository.existsById(patient.getPatientNumber());
        if (exists) {
            return Optional.empty(); // or throw a custom exception
        }
        return Optional.of(patientRepository.save(patient));
    }



}
