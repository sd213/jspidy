package org.jsp.tenthboot_patientmanagement.repository;

import org.jsp.tenthboot_patientmanagement.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Integer> {

}
