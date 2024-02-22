package com.example.Employee.entity;

import jakarta.persistence.*;

@Entity
public class spouse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String mobileNo;
    private int age;

    @OneToOne(mappedBy = "spouse")
    private employee employee;

    public spouse(){

    }

    public spouse(String name, String mobileNo, int age) {
        this.name = name;
        this.mobileNo = mobileNo;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
