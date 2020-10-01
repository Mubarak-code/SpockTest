package com.example.GroovyTest.service;

import com.example.GroovyTest.model.EmployeeDTO;
import com.example.GroovyTest.repository.EmployeeDTORepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeDTOService {

    private EmployeeDTORepository repo;

    @Autowired
    public EmployeeDTOService(EmployeeDTORepository repo){
        this.repo = repo;
    }


}
