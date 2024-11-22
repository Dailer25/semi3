package com.taller.trabajo.dto;

import com.taller.trabajo.Models.MedicalAppointment;
import com.taller.trabajo.Models.State;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MedicalAppointmentDTO {
    private Long id;
    private State state;
    private String date;
    private MedicalRecordDTO medicalRecord;
    private DoctorDTO doctor;
    private PatientDTO patient;
    private AdministrativeDTO administrative;

    public MedicalAppointmentDTO(MedicalAppointment medicalAppointment) {
    }

    public MedicalAppointmentDTO(Object medicalAppointment) {
    }

    public Long getId() {
        return id;
    }

    public State getState() {
        return state;
    }

    public Date getDate() {
        return date;
    }


    public DoctorDTO getDoctor() {
        return doctor;
    }

    public PatientDTO getPatient() {
        return patient;
    }

    public AdministrativeDTO getAdministrative() {
        return administrative;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setMedicalRecord(MedicalRecordDTO medicalRecord) {
        this.medicalRecord = medicalRecord;
    }

    public void setDoctor(DoctorDTO doctor) {
        this.doctor = doctor;
    }

    public void setPatient(PatientDTO patient) {
        this.patient = patient;
    }

    public void setAdministrative(AdministrativeDTO administrative) {
        this.administrative = administrative;
    }
}
