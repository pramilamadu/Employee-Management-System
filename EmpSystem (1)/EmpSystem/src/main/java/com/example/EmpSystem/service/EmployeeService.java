package com.example.EmpSystem.service;

import com.example.EmpSystem.dao.EmployeeDao;
import com.example.EmpSystem.dto.EmployeeDto;
import com.example.EmpSystem.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeDao employeeDao;


    public List<Employee>getAllEmployee(){
        List<Employee> employees = this.employeeDao.findAll();
        return employees;
    }
}
