package com.example.EmpSystem.controller;

import com.example.EmpSystem.model.Employee;
import com.example.EmpSystem.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
@CrossOrigin(origins = "http://localhost:4200/")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping(value = "/get-all-employees")
    public ResponseEntity<List<Employee>> getAllEmployee(){
        List<Employee> employees = this.employeeService.getAllEmployee();

        return new ResponseEntity<>(employees , HttpStatus.OK);
    }
    }

