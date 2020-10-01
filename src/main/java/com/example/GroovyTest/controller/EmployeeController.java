package com.example.GroovyTest.controller;

import com.example.GroovyTest.model.Employee;
import com.example.GroovyTest.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    private EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService){
         this.employeeService = employeeService;
    }
    @PostMapping("newemployee")
    public ResponseEntity newEmployee(@RequestBody Employee employee){
        if (employee != null) {
            System.out.println(employee.getName());
            employeeService.newEmployee(employee);
            return new ResponseEntity("successfully saved", HttpStatus.OK);
        }
        else
            return new ResponseEntity ("Invalid Input", HttpStatus.OK);
    }
    @GetMapping("allemployees")
    public ResponseEntity<?> getAllEmployees(){
    return new ResponseEntity<>(employeeService.getAllEmployees(), HttpStatus.OK) ;
    }
}
