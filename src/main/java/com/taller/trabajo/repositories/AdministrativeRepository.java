package com.taller.trabajo.repositories;

import com.taller.trabajo.Models.Administrative;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdministrativeRepository extends JpaRepository<Administrative, Long> {
    Administrative findById(long id);
}
