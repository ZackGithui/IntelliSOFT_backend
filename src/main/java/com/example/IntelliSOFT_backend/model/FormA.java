package com.example.IntelliSOFT_backend.model;


import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name ="FormA")
public class FormA {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Date visit_date;
    private String general_health;
    private Boolean diet;
    private String comments;




    public FormA(){

    }

    public FormA(Integer id,Date visit_date,String general_health,Boolean diet,String comments){
        this.diet = diet;
        this.visit_date = visit_date;
        this.general_health = general_health;
        this.comments = comments;
        this.id = id;

    }

    public Date getVisitDate() {
        return visit_date;
    }

    public Boolean getDiet() {
        return diet;
    }

    public Integer getId() {
        return id;
    }

    public String getGeneralHealth() {
        return general_health;
    }

    public String getComments() {
        return comments;
    }

    public void setVisitDate(Date visitDate) {
        this.visit_date = visitDate;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setDiet(Boolean diet) {
        this.diet = diet;
    }

    public void setGeneralHealth(String generalHealth) {
        this.general_health = generalHealth;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
