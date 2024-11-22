package com.taller.trabajo.dto;

import com.taller.trabajo.Models.Administrative;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AdministrativeDTO {
    private Long id;
    private String name;
    private String lastName;
    private String email;
    private String phone;
    private String position;
    private List<MedicalAppointmentDTO> medicalAppointments;

    public AdministrativeDTO(Administrative administrative) {
    }

    public AdministrativeDTO(Object administrative) {
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

    public String getPosition() {
        return position;
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

    public void setPosition(String position) {
        this.position = position;
    }

    public List<MedicalAppointmentDTO> getMedicalAppointments() {
        return medicalAppointments;
    }

    public void setMedicalAppointments(List<MedicalAppointmentDTO> medicalAppointments) {
        this.medicalAppointments = medicalAppointments;
    }
}
