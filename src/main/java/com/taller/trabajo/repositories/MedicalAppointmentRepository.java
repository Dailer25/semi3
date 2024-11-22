package com.taller.trabajo.repositories;

import com.taller.trabajo.Models.MedicalAppointment;
import com.taller.trabajo.Models.State;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Stack;

public interface MedicalAppointmentRepository extends JpaRepository<MedicalAppointment, Long> {
    MedicalAppointment findById(long id);
    MedicalAppointment findByState(State state);
}
