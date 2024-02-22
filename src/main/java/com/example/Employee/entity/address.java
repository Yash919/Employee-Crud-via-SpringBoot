package com.example.Employee.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table(name = "address")
public class address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String line1;
    private String line2;
    private String zipCode;
    private String city;
    private String state;
    private String country;

    @JsonIgnore // This will end the infinite loop for create employee
    @ManyToOne
    private employee employee;

    public address(){

    }



    public address(String line1, String line2, String zipCode, String city, String state, String country,employee employee) {
        this.line1 = line1;
        this.line2 = line2;
        this.zipCode = zipCode;
        this.city = city;
        this.state = state;
        this.country = country;
        this.employee=employee;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLine1() {
        return line1;
    }

    public void setLine1(String line1) {
        this.line1 = line1;
    }

    public String getLine2() {
        return line2;
    }

    public void setLine2(String line2) {
        this.line2 = line2;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public com.example.Employee.entity.employee getEmployee() {
        return employee;
    }

    public void setEmployee(com.example.Employee.entity.employee employee) {
        this.employee = employee;
    }
}
