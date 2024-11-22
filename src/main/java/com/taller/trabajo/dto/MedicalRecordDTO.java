package com.taller.trabajo.dto;

import com.taller.trabajo.Models.MedicalRecord;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MedicalRecordDTO {
    private Long id;
    private String type;
    private byte[] data;
    private List<MedicalExaminationDTO> medicalExaminations;
    private DoctorDTO doctor;
    private MedicalAppointmentDTO medicalAppointment;
    private PatientDTO patient;

    public MedicalRecordDTO(MedicalRecord medicalRecord) {
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

    public List<MedicalExaminationDTO> getMedicalExaminations() {
        return medicalExaminations;
    }

    public DoctorDTO getDoctor() {
        return doctor;
    }

    public MedicalAppointmentDTO getMedicalAppointment() {
        return medicalAppointment;
    }

    public PatientDTO getPatient() {
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

    public void setMedicalExaminations(List<MedicalExaminationDTO> medicalExaminations) {
        this.medicalExaminations = medicalExaminations;
    }

    public void setDoctor(DoctorDTO doctor) {
        this.doctor = doctor;
    }

    public void setMedicalAppointment(MedicalAppointmentDTO medicalAppointment) {
        this.medicalAppointment = medicalAppointment;
    }

    public void setPatient(PatientDTO patient) {
        this.patient = patient;
    }
}
