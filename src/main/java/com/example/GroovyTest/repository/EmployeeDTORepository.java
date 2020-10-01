package com.example.GroovyTest.repository;

import com.example.GroovyTest.model.EmployeeDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeDTORepository extends JpaRepository<EmployeeDTO, Long> {
}
