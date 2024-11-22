package com.taller.trabajo.Services;

import com.taller.trabajo.Models.Doctor;
import com.taller.trabajo.dto.DoctorDTO;
import com.taller.trabajo.dto.MedicalAppointmentDTO;
import com.taller.trabajo.dto.MedicalRecordDTO;
import com.taller.trabajo.dto.SpecialtyDTO;
import com.taller.trabajo.repositories.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;

    public DoctorDTO getDoctorById(Long id){
        return doctorRepository.findById(id).map(DoctorDTO::new).orElse(null);
    }

    public DoctorDTO createDoctor(DoctorDTO doctorDTO){
        Doctor doctor = new Doctor();
        doctor.setName(doctorDTO.getName());
        doctor.setLastName(doctorDTO.getLastName());
        doctor.setEmail(doctorDTO.getEmail());
        doctor.setPhone(doctorDTO.getPhone());
        doctor = doctorRepository.save(doctor);
        return convertToDTO(doctor);
    }

    public DoctorDTO convertToDTO(Doctor doctor){
        DoctorDTO doctorDTO = new DoctorDTO();
        doctorDTO.setId(doctor.getId());
        doctorDTO.setName(doctor.getName());
        doctorDTO.setLastName(doctor.getLastName());
        doctorDTO.setEmail(doctor.getEmail());
        doctorDTO.setPhone(doctor.getPhone());
        doctorDTO.setMedicalAppointments(doctor.getMedicalAppointments().stream().map(medicalAppointment -> new MedicalAppointmentDTO(medicalAppointment)).collect(Collectors.toList()));
        doctorDTO.setMedicalRecords(doctor.getMedicalRecords().stream().map(medicalRecord -> new MedicalRecordDTO(medicalRecord)).collect(Collectors.toList()));
        doctorDTO.setSpecialties(doctor.getSpecialties().stream().map(specialty -> new SpecialtyDTO(specialty)).collect(Collectors.toList()));
        return doctorDTO;
    }
}
