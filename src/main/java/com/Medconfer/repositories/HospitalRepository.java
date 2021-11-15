package com.Medconfer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.Medconfer.entities.Hospital;

public interface HospitalRepository extends JpaRepository<Hospital, Long> {

}
