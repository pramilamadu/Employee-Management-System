package com.example.EmpSystem.dao;

import com.example.EmpSystem.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeDao extends JpaRepository <Employee , Integer> {


}
