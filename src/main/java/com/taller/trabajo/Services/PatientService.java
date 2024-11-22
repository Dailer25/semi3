package com.taller.trabajo.Services;


import com.taller.trabajo.Models.Patient;
import com.taller.trabajo.dto.MedicalAppointmentDTO;
import com.taller.trabajo.dto.MedicalExaminationDTO;
import com.taller.trabajo.dto.MedicalRecordDTO;
import com.taller.trabajo.dto.PatientDTO;
import com.taller.trabajo.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class PatientService {
    @Autowired
    private PatientRepository patientRepository;

    public PatientDTO getPatientById(Long id){
        return patientRepository.findById(id).map(PatientDTO::new).orElse(null);
    }

    public PatientDTO createPatient(PatientDTO patientDTO){
        Patient patient = new Patient();
        patient.setId(patientDTO.getId());
        patient.setName(patientDTO.getName());
        patient.setLastName(patientDTO.getLastName());
        patient.setAddress(patientDTO.getAddress());
        patient.setPhone(patientDTO.getPhone());
        patient.setEmail(patientDTO.getEmail());
        patient.setBornDate(patientDTO.getBornDate());
        patient = patientRepository.save(patient);
        return convertToDTO(patient);
    }

    public PatientDTO convertToDTO(Patient patient){
        PatientDTO patientDTO = new PatientDTO();
        patientDTO.setId(patient.getId());
        patientDTO.setName(patient.getName());
        patientDTO.setLastName(patient.getLastName());
        patientDTO.setAddress(patient.getAddress());
        patientDTO.setPhone(patient.getPhone());
        patientDTO.setEmail(patient.getEmail());
        patientDTO.setBornDate(patient.getBornDate());
        patientDTO.setMedicalAppointments(patient.getMedicalAppointments().stream().map(medicalAppointment -> new MedicalAppointmentDTO(medicalAppointment)).collect(Collectors.toList()));
        patientDTO.setMedicalExaminations(patient.getMedicalExaminations().stream().map(medicalExamination -> new MedicalExaminationDTO(medicalExamination)).collect(Collectors.toList()));
        patientDTO.setMedicalRecords(patient.getMedicalRecords().stream().map(medicalRecord -> new MedicalRecordDTO(medicalRecord)).collect(Collectors.toList()));
        return patientDTO;
    }
}
