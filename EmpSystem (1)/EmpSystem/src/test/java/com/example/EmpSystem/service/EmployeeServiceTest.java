package com.example.EmpSystem.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class EmployeeServiceTest {

    @Autowired
    private EmployeeService employeeService;
    @Test
    void getAllEmployee() {
        employeeService.getAllEmployee();
    }
}