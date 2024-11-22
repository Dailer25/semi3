package com.taller.trabajo.Services;


import com.taller.trabajo.Models.Administrative;
import com.taller.trabajo.dto.AdministrativeDTO;
import com.taller.trabajo.dto.MedicalAppointmentDTO;
import com.taller.trabajo.repositories.AdministrativeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class AdministrativeService {
    @Autowired
    private AdministrativeRepository administrativeRepository;

    public AdministrativeDTO getAdministrativeById(Long id){
        return administrativeRepository.findById(id).map(AdministrativeDTO::new).orElse(null);

    }
    public AdministrativeDTO createAdministrative(AdministrativeDTO administrativeDTO){
        Administrative  administrative = new Administrative();
        administrative.setId(administrativeDTO.getId());
        administrative.setName(administrativeDTO.getName());
        administrative.setLastName(administrativeDTO.getLastName());
        administrative.setPhone(administrativeDTO.getPhone());
        administrative.setEmail(administrativeDTO.getEmail());
        administrative.setPosition(administrativeDTO.getPosition());
        administrative = administrativeRepository.save(administrative);
        return converToTDO(administrative);
    }
    public AdministrativeDTO converToTDO(Administrative administrative){
        AdministrativeDTO administrativeDTO = new AdministrativeDTO();
        administrativeDTO.setId(administrative.getId());
        administrativeDTO.setName(administrative.getName());
        administrativeDTO.setLastName(administrative.getLastName());
        administrativeDTO.setPhone(administrative.getPhone());
        administrativeDTO.setEmail(administrative.getEmail());
        administrativeDTO.setPosition(administrative.getPosition());
        administrativeDTO.setMedicalAppointments(administrative.getMedicalAppointments().stream().map(medicalAppointment -> new MedicalAppointmentDTO(medicalAppointment)).collect(Collectors.toList()));
        return administrativeDTO;
    }

}
