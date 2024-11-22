package com.taller.trabajo.dto;

import com.taller.trabajo.Models.Doctor;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DoctorDTO {
    private Long id;
    private String name;
    private String lastName;
    private String email;
    private String phone;
    private List<MedicalRecordDTO> medicalRecords;
    private List<MedicalAppointmentDTO> medicalAppointments;
    private List<SpecialtyDTO> specialties;

    public DoctorDTO(Doctor doctor) {
    }

    public DoctorDTO(Object doctor) {
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

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public List<MedicalRecordDTO> getMedicalRecords() {
        return medicalRecords;
    }

    public List<MedicalAppointmentDTO> getMedicalAppointments() {
        return medicalAppointments;
    }

    public List<SpecialtyDTO> getSpecialties() {
        return specialties;
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

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setMedicalRecords(List<MedicalRecordDTO> medicalRecords) {
        this.medicalRecords = medicalRecords;
    }

    public void setMedicalAppointments(List<MedicalAppointmentDTO> medicalAppointments) {
        this.medicalAppointments = medicalAppointments;
    }

    public void setSpecialties(List<SpecialtyDTO> specialties) {
        this.specialties = specialties;
    }
}
