package com.example.IntelliSOFT_backend.controller;


import com.example.IntelliSOFT_backend.model.FormA;
import com.example.IntelliSOFT_backend.model.Vitals;
import com.example.IntelliSOFT_backend.service.FormAService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/intelliSoft")
public class FormAController {

    @Autowired
    private FormAService formAService;

    @GetMapping("getFormA")
    public List<FormA> getFormData(){
        return formAService.getFormData();
    }

    @PostMapping("postFormA")
    ResponseEntity<FormA> postFormData(@RequestBody FormA formA){
        FormA saved = formAService.saveForm(formA);
        return ResponseEntity.ok(saved);
    }
}
