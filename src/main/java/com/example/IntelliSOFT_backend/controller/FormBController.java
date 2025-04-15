package com.example.IntelliSOFT_backend.controller;



import com.example.IntelliSOFT_backend.model.FormA;
import com.example.IntelliSOFT_backend.model.FormB;
import com.example.IntelliSOFT_backend.model.Vitals;
import com.example.IntelliSOFT_backend.service.FormAService;
import com.example.IntelliSOFT_backend.service.FormBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/intelliSoft")
public class FormBController {

    @Autowired
    private FormBService formBService;

    @GetMapping("getFormB")
    public List<FormB> getFormData(){
        return formBService.getFormData();
    }

    @PostMapping("postFormB")
    ResponseEntity<FormB> postFormData(@RequestBody FormB formB){
        FormB saved = formBService.saveForm(formB);
        return ResponseEntity.ok(saved);
    }
}
