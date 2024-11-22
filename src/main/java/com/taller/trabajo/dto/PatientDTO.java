package com.taller.trabajo.dto;

import com.taller.trabajo.Models.Patient;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PatientDTO {
    private Long id;
    private String name;
    private String lastName;
    private String address;
    private String phone;
    private String email;
    private LocalDate bornDate;
    private List<MedicalExaminationDTO> medicalExaminations;
    private List<MedicalRecordDTO> medicalRecords;
    private List<MedicalAppointmentDTO> medicalAppointments;

    public PatientDTO(Patient patient) {
    }

    public PatientDTO(Object patient) {
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setBornDate(LocalDate bornDate) {
        this.bornDate = bornDate;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getBornDate() {
        return bornDate;
    }

    public List<MedicalExaminationDTO> getMedicalExaminations() {
        return medicalExaminations;
    }

    public List<MedicalRecordDTO> getMedicalRecords() {
        return medicalRecords;
    }

    public List<MedicalAppointmentDTO> getMedicalAppointments() {
        return medicalAppointments;
    }

    public void setMedicalExaminations(List<MedicalExaminationDTO> medicalExaminations) {
        this.medicalExaminations = medicalExaminations;
    }

    public void setMedicalRecords(List<MedicalRecordDTO> medicalRecords) {
        this.medicalRecords = medicalRecords;
    }

    public void setMedicalAppointments(List<MedicalAppointmentDTO> medicalAppointments) {
        this.medicalAppointments = medicalAppointments;
    }
}
