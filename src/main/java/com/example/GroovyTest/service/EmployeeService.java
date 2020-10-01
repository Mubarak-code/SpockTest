package com.example.GroovyTest.service;

import com.example.GroovyTest.model.Employee;
import com.example.GroovyTest.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    private EmployeeRepository repo;

    @Autowired
    public EmployeeService(EmployeeRepository repo){
        this.repo = repo;
    }

    public List<Employee> getAllEmployees(){

        return repo.findAll();
    }

    public String newEmployee(Employee employee){
        repo.save(employee);
        return "new Employee created";
    }

}
