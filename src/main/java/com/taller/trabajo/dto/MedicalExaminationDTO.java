package com.taller.trabajo.dto;

import com.taller.trabajo.Models.MedicalExamination;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MedicalExaminationDTO {
    private Long id;
    private String name;
    private String description;
    private PatientDTO patientId;
    private MedicalRecordDTO medicalRecordId;

    public MedicalExaminationDTO(MedicalExamination medicalExamination) {
    }
}
