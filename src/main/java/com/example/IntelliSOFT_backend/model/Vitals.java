package com.example.IntelliSOFT_backend.model;


import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name  ="Vitals")
public class Vitals {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Integer vital_id;
  //  @Column(nullable = false)
    private Date visit_date;

    private Double height;

    private Double weight;
    //@Column(nullable = false)
   // private Long BMI;


    public Vitals(){

    }

    public Vitals(Integer vital_id,Date visit_date,Double height,Double weight){
        this.visit_date = visit_date;
        this.vital_id = vital_id;
        this.height = height;
        this.weight = weight;

    }

    //setters and getters


    public Integer getVital_id() {
        return vital_id;
    }

    public void setVital_id(Integer vital_id) {
        this.vital_id = vital_id;
    }

    public Date getVisitDate() {
        return visit_date;
    }

    /*public Long getBMI() {
        return BMI;
    }*/

    public Double getHeight() {
        return height;
    }

    public Double getWeight() {
        return weight;
    }

   /* public void setBMI(Long BMI) {
        this.BMI = BMI;
    }*/

    public void setHeight(Double height) {
        this.height = height;
    }

    public void setVisitDate(Date visit_date) {
        this.visit_date = visit_date;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }
}

