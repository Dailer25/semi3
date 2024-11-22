package com.taller.trabajo.repositories;

import com.taller.trabajo.Models.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
    Doctor findById(long id);
}
