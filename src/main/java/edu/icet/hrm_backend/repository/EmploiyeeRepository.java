package edu.icet.hrm_backend.repository;

import edu.icet.hrm_backend.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmploiyeeRepository extends JpaRepository<EmployeeEntity, Long> {
    boolean existsByEmail(String email);
}
