package com.fsad.employee.hql.entity;

import java.util.Date;
import jakarta.persistence.*;

@Entity
@Table(name = "appointment")
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long appointmentId;

    private String doctorName;
    private String department;

    @Temporal(TemporalType.DATE)
    private Date appointmentDate;

    private Double consultationFee;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;

    // ===== GETTERS =====
    public Long getAppointmentId() {
        return appointmentId;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public String getDepartment() {
        return department;
    }

    public Date getAppointmentDate() {
        return appointmentDate;
    }

    public Double getConsultationFee() {
        return consultationFee;
    }

    public Patient getPatient() {
        return patient;
    }

    // ===== SETTERS (optional but recommended) =====
    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setAppointmentDate(Date appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public void setConsultationFee(Double consultationFee) {
        this.consultationFee = consultationFee;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
}
