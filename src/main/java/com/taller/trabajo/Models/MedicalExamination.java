package com.taller.trabajo.Models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "medicalexamination")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MedicalExamination {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;

    @ManyToOne @JoinColumn(name = "patient_id")
    private Patient patient;

    @ManyToOne @JoinColumn(name = "medicalrecord_id")
    private MedicalRecord medicalRecord;

}
