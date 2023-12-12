package com.example.EmpSystem.dto;

import com.example.EmpSystem.model.Department;
import com.example.EmpSystem.model.Employee;

import java.util.Date;

public class EmployeeDto {

    private Integer empID;
    private String empName;
    private String address;
    private Integer age;
    private Integer phoneNumber;
    private Double salary;
    private String status;
    private Date reqDate;
    private Department dep_ID;


    public EmployeeDto() {
    }

    public EmployeeDto(Employee employee) {
        this.empID = employee.getEmpID();
        this.empName = employee.getEmpName();
        this.address = employee.getAddress();
        this.age = employee.getAge();
        this.phoneNumber = employee.getPhoneNumber();
        this.salary = employee.getSalary();
        this.status = employee.getStatus();
        this.reqDate = employee.getReqDate();
        this.dep_ID = employee.getDep_ID();
    }

    public Integer getEmpID() {
        return empID;
    }

    public void setEmpID(Integer empID) {
        this.empID = empID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getReqDate() {
        return reqDate;
    }

    public void setReqDate(Date reqDate) {
        this.reqDate = reqDate;
    }

    public Department getDep_ID() {
        return dep_ID;
    }

    public void setDep_ID(Department dep_ID) {
        this.dep_ID = dep_ID;
    }
}
