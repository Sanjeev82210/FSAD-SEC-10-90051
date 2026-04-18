package com.fsad.employee.hql.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "patient")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long patientId;

    private String patientName;
    private Integer age;
    private String gender;
    private String disease;

    // ===== GETTERS =====
    public Long getPatientId() {
        return patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public Integer getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getDisease() {
        return disease;
    }

    // ===== SETTERS (optional) =====
    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }
}
