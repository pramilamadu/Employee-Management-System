package com.example.EmpSystem.model;

import javax.persistence.*;

@Entity
@Table(name = "department")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DEP_ID")
    private Integer depID;
    @Column(name = "DEP_NAME")
    private String depName;
    @Column(name = "DEP_HEAD")
    private String depHead;


    public Department() {
    }

    public Department(Integer depID, String depName, String depHead) {
        this.depID = depID;
        this.depName = depName;
        this.depHead = depHead;
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
