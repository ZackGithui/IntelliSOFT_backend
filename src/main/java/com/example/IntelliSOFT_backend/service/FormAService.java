package com.example.IntelliSOFT_backend.service;


import com.example.IntelliSOFT_backend.model.FormA;
import com.example.IntelliSOFT_backend.repository.FormARepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FormAService {

    private final FormARepository formARepository;

    @Autowired
    public FormAService(FormARepository formARepository){
        this.formARepository = formARepository;
    }

    public FormA saveForm(FormA formA){
        return formARepository.save(formA);
    }
   public  List<FormA> getFormData(){
        return formARepository.findAll();
   }
}
