package com.project.back_end.repo;

import org.springframework.data.repository.CrudRepository;
import com.project.back_end.models.Patient;

public interface PatientRepository extends CrudRepository<Patient, Integer> {
}
