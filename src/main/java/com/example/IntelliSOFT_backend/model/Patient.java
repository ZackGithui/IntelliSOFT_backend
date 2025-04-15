package com.example.IntelliSOFT_backend.model;


import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;


//Patient registration model which maps with the table in the database
//@Data
@Entity
@Table (name= "Patient")
public class Patient {
    @Id
    @Column(unique = true,nullable = false)
    private Integer patient_number;
    private Date reg_date;
    private String first_name;
    private String last_name;
    @Column(nullable = false)
    private Date dob;
    private String gender;




    //non argument constructor
    public Patient() {

    }

    //All argument constructor

    public Patient(Integer patient_number, Date reg_date, String first_name, String last_name, Date dob,  String gender
    ) {
        this.patient_number = patient_number;
        this.reg_date = reg_date;
        this.first_name = first_name;
        this.last_name = last_name;
        this.dob = dob;
        this.gender = gender;

    }
    //getters and setters


    public Integer getPatientNumber() {
        return patient_number;
    }

    public Date getRegDate() {
        return reg_date;
    }

    public Date getDoB() {
        return dob;
    }

    public String getFirstName() {
        return first_name;
    }

    public String getGender() {
        return gender;
    }

    public void setPatientNumber(Integer patientNumber) {
        this.patient_number = patientNumber;
    }

    public String getLastName() {
        return last_name;
    }

    public void setFirstName(String first_name) {
        this.first_name = first_name;
    }

    public void setRegDate(Date regDate) {
        this.reg_date = regDate;
    }

    public void setDoB(Date dob) {
        this.dob = dob;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setLastName(String last_name) {
        this.last_name = last_name;
    }
}
