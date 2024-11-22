package com.taller.trabajo.repositories;

import com.taller.trabajo.Models.MedicalRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicalRecordRepository extends JpaRepository<MedicalRecord, Long> {
    MedicalRecord findById(long id);
}
