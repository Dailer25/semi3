package com.taller.trabajo.Models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "medicalappointment")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MedicalAppointment {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private State state;
    private Date date;


    @OneToOne(mappedBy = "medicalAppointment")
    private MedicalRecord medicalRecord;

    @ManyToOne @JoinColumn(name = "doctor_id")
    private Doctor doctor;

    @ManyToOne @JoinColumn(name = "patient_id")
    private Patient patient;

    @ManyToOne @JoinColumn(name = "administrative_id")
    private Administrative administrative;

    public Long getId() {
        return id;
    }

    public State getState() {
        return state;
    }

    public String getDate() {
        return date;
    }

    public MedicalRecord getMedicalRecord() {
        return medicalRecord;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public Administrative getAdministrative() {
        return administrative;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setMedicalRecord(MedicalRecord medicalRecord) {
        this.medicalRecord = medicalRecord;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public void setAdministrative(Administrative administrative) {
        this.administrative = administrative;
    }
}
