package com.example.EmpSystem.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EMP_ID")
    private Integer empID;
    @Column(name = "EMP_NAME")
    private String empName;
    @Column(name = "EMP_ADDRESS")
    private String address;
    @Column(name = "EMP_AGE")
    private Integer age;
    @Column(name = "EMP_TEL_NO")
    private Integer phoneNumber;
    @Column(name = "EMP_SALARY")
    private Double salary;
    @Column(name = "EMP_STATUS")
    private String status;
    @Column(name = "EMP_REQ_DATE")
    private Date reqDate;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DEP_ID")
    private Department dep_ID;


    public Employee() {
    }

    public Employee(Integer empID, String empName, String address, Integer age, Integer phoneNumber, Double salary, String status, Date reqDate, Department dep_ID) {
        this.empID = empID;
        this.empName = empName;
        this.address = address;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.status = status;
        this.reqDate = reqDate;
        this.dep_ID = dep_ID;
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
