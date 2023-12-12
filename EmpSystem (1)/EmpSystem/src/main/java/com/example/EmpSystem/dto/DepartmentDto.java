package com.example.EmpSystem.dto;

import com.example.EmpSystem.model.Department;

public class DepartmentDto {

    private Integer depID;
    private String depName;
    private String depHead;


    public DepartmentDto() {
    }

    public DepartmentDto(Department department) {
        this.depID = department.getDepID();
        this.depName = department.getDepName();
        this.depHead = department.getDepHead();
    }

    public Integer getDepID() {
        return depID;
    }

    public void setDepID(Integer depID) {
        this.depID = depID;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public String getDepHead() {
        return depHead;
    }

    public void setDepHead(String depHead) {
        this.depHead = depHead;
    }
}
