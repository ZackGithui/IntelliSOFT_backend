package com.example.IntelliSOFT_backend.repository;

import com.example.IntelliSOFT_backend.model.FormB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormBRepository extends JpaRepository<FormB,Integer> {
}
