package com.taller.trabajo.repositories;

import com.taller.trabajo.Models.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
    Patient findById(long id);



}
