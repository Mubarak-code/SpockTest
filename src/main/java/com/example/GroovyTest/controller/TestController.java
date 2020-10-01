package com.example.GroovyTest.controller;

import com.example.GroovyTest.model.Employee;
import com.example.GroovyTest.model.EmployeeDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {



    @GetMapping ("test")
    public String test(){
        return "sucessful connection";
    }

}
