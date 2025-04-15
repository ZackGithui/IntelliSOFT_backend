package com.example.IntelliSOFT_backend.controller;


//The controller class is used to create the desired endpoints

import com.example.IntelliSOFT_backend.model.Patient;
import com.example.IntelliSOFT_backend.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/intelliSoft")
public class PatientController {
    //DI
    @Autowired
    private PatientService patientService;

    @GetMapping("patients")
    public List<Patient> getAllPatients(){
        return patientService.getAllPatients();
    }

    @PostMapping("/patient")
    public ResponseEntity<?> addPatient(@RequestBody Patient patient) {
        Optional<Patient> created = patientService.createPatient(patient);
        if (created.isPresent()) {
            return ResponseEntity.ok(created.get());
        } else {
            return ResponseEntity.status(HttpStatus.CONFLICT)
                    .body("A patient with that ID already exists.");
        }
    }



}
