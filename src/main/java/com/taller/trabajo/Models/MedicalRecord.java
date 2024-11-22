package com.taller.trabajo.Models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "medicalrecord")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MedicalRecord {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String type;
    @Lob
    private byte[] data;




    @OneToMany(mappedBy = "medicalRecord")
    private List<MedicalExamination> medicalExaminations;

    @ManyToOne  @JoinColumn(name = "doctor_id")
    private Doctor doctor;

    @OneToOne @JoinColumn(name = "medicalappointment_id")
    private MedicalAppointment medicalAppointment;

    @ManyToOne @JoinColumn(name = "patient_id")
    private Patient patient;


    public MedicalRecord(Object medicalRecord) {
    }

    public Long getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public byte[] getData() {
        return data;
    }

    public List<MedicalExamination> getMedicalExaminations() {
        return medicalExaminations;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public MedicalAppointment getMedicalAppointment() {
        return medicalAppointment;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setData(byte[] data) {
        this.data = data;
    }

    public void setMedicalExaminations(List<MedicalExamination> medicalExaminations) {
        this.medicalExaminations = medicalExaminations;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public void setMedicalAppointment(MedicalAppointment medicalAppointment) {
        this.medicalAppointment = medicalAppointment;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
}
