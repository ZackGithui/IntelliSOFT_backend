package com.example.IntelliSOFT_backend.controller;


import com.example.IntelliSOFT_backend.model.Vitals;
import com.example.IntelliSOFT_backend.service.VitalsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/intelliSoft")
public class VitalsController {

    @Autowired
    private VitalsService vitalsService;


    @GetMapping("vitals")
    public List<Vitals> getAllVitals(){
        return vitalsService.getVitals();
    }

    @PostMapping("vital")
    ResponseEntity<Vitals> postVital(@RequestBody Vitals vitals){
        Vitals saved = vitalsService.createVitals(vitals);
        return ResponseEntity.ok(saved);
    }
}
