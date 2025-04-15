package com.example.IntelliSOFT_backend.repository;

import com.example.IntelliSOFT_backend.model.Patient;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;


//Using Jpa to access CRUD operations
@Repository
public interface PatientRepository extends JpaRepository<Patient,Integer> {
   //Optional<Patient> findById(Integer patientNumber);

}
