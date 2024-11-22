package com.taller.trabajo.Services;


import com.taller.trabajo.Models.MedicalRecord;
import com.taller.trabajo.dto.*;
import com.taller.trabajo.repositories.MedicalRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class MedicalRecordService {
    @Autowired
    private MedicalRecordRepository medicalRecordRepository;

    public MedicalRecordDTO getMedicalRecordById(Long id){
        return medicalRecordRepository.findById(id).map(MedicalRecordDTO::new).orElse(null);
    }

    public MedicalRecordDTO createMedicalRecord(MedicalRecordDTO medicalRecordDTO){
        MedicalRecord medicalRecord = new MedicalRecord();
        medicalRecord.setId(medicalRecordDTO.getId());
        medicalRecord.setType(medicalRecordDTO.getType());
        medicalRecord.setData(medicalRecordDTO.getData());
        medicalRecord = medicalRecordRepository.save(medicalRecord);
        return convertToDTO(medicalRecord);
    }

    public MedicalRecordDTO convertToDTO(MedicalRecord medicalRecord){
        MedicalRecordDTO medicalRecordDTO = new MedicalRecordDTO();
        medicalRecordDTO.setId(medicalRecord.getId());
        medicalRecordDTO.setType(medicalRecord.getType());
        medicalRecordDTO.setData(medicalRecord.getData());
        medicalRecordDTO.setMedicalExaminations(medicalRecord.getMedicalExaminations().stream().map(medicalExamination -> new MedicalExaminationDTO(medicalExamination)).collect(Collectors.toList()));
        medicalRecordDTO.setDoctor(medicalRecord.getDoctor().stream().map(doctor -> new DoctorDTO(doctor)).collect(Collectors.toList()));
        medicalRecordDTO.setMedicalAppointment(medicalRecord.getMedicalAppointment().stream().map(medicalAppointment -> new MedicalAppointmentDTO(medicalAppointment)).collect(Collectors.toList()));
        medicalRecordDTO.setPatient(medicalRecord.getPatient().stream().map(patient -> new PatientDTO(patient)).collect(Collectors.toList()));
        return medicalRecordDTO;
    }

}
