package com.example.IntelliSOFT_backend.repository;


import com.example.IntelliSOFT_backend.model.FormA;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormARepository extends JpaRepository<FormA,Integer> {
}
