package com.example.IntelliSOFT_backend.repository;


import com.example.IntelliSOFT_backend.model.Vitals;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface VitalsRepository extends JpaRepository<Vitals, Integer> {
}
