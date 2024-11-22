package com.taller.trabajo.dto;

import com.taller.trabajo.Models.Specialty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SpecialtyDTO {
    private Long id;
    private String specialty;
    private List<DoctorDTO> doctors;

    public SpecialtyDTO(Specialty specialty) {
    }
}
