package com.taller.trabajo.repositories;

import com.taller.trabajo.Models.MedicalExamination;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicalExaminationRepository extends JpaRepository<MedicalExamination, Long> {
    MedicalExamination findById(long id);
    MedicalExamination findByName(String name);
}
