package com.example.IntelliSOFT_backend.service;

import com.example.IntelliSOFT_backend.model.FormA;
import com.example.IntelliSOFT_backend.model.FormB;
import com.example.IntelliSOFT_backend.repository.FormARepository;
import com.example.IntelliSOFT_backend.repository.FormBRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FormBService {

    private final FormBRepository formBRepository;

    @Autowired
    public FormBService(FormBRepository formBRepository){
        this.formBRepository = formBRepository;
    }

    public FormB saveForm(FormB formB){
        return formBRepository.save(formB);
    }
    public  List<FormB> getFormData(){
        return formBRepository.findAll();
    }
}
