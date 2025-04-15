package com.example.IntelliSOFT_backend.service;


import com.example.IntelliSOFT_backend.model.Vitals;
import com.example.IntelliSOFT_backend.repository.VitalsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VitalsService {
    private final VitalsRepository vitalsRepository;

    @Autowired
    public VitalsService(VitalsRepository vitalsRepository){
        this.vitalsRepository = vitalsRepository;
    }


    public Vitals createVitals(Vitals vitals){
        return vitalsRepository.save(vitals);
    }

    public List<Vitals> getVitals(){
        return vitalsRepository.findAll();
    }



}
