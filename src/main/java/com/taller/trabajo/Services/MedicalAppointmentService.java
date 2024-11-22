package com.taller.trabajo.Services;


import com.taller.trabajo.Models.MedicalAppointment;
import com.taller.trabajo.Models.MedicalRecord;
import com.taller.trabajo.dto.AdministrativeDTO;
import com.taller.trabajo.dto.MedicalAppointmentDTO;
import com.taller.trabajo.dto.MedicalExaminationDTO;
import com.taller.trabajo.dto.MedicalRecordDTO;
import com.taller.trabajo.repositories.MedicalAppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class MedicalAppointmentService {
    @Autowired
    private MedicalAppointmentService medicalAppointmentService;
    @Autowired
    private MedicalAppointmentRepository medicalAppointmentRepository;

    public MedicalAppointmentDTO getMedicalAppointmentByID(Long id){
        return medicalAppointmentRepository.findById(id).map(MedicalAppointmentDTO::new).orElse(null);
    }

    public MedicalAppointmentDTO createMedicalAppointment(MedicalAppointmentDTO medicalAppointmentDTO){
        MedicalAppointment medicalAppointment = new MedicalAppointment();
        medicalAppointment.setId(medicalAppointmentDTO.getId());
        medicalAppointment.setDate(medicalAppointmentDTO.getDate());
        medicalAppointment.setState(medicalAppointmentDTO.getState());
        medicalAppointmentRepository.save(medicalAppointment);
        return convertToDTO(medicalAppointment);
    }

    public MedicalAppointmentDTO convertToDTO(MedicalAppointment medicalAppointment){
        MedicalAppointmentDTO medicalAppointmentTDO = new MedicalAppointmentDTO();
        medicalAppointmentTDO.setId(medicalAppointment.getId());
        medicalAppointmentTDO.setDate(medicalAppointment.getDate());
        medicalAppointmentTDO.setState(medicalAppointment.getState());
        medicalAppointmentTDO.getMedicalRecord(medicalAppointment.getMedicalRecord().stream()
                .map(product -> new MedicalRecordDTO(medicalRecord.getId(), medicalRecord.getType(), medicalRecord.getData(), null))
                .collect(Collectors.toList()));
        return medicalAppointmentTDO;
    }

}
