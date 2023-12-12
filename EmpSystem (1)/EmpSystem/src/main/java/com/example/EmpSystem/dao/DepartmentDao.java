package com.example.EmpSystem.dao;

import com.example.EmpSystem.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentDao extends JpaRepository<Department , Integer> {


}
