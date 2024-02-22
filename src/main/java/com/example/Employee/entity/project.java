package com.example.Employee.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name ="project")
public class project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Persist will give error when you deleting it shows referential integrity. by adding remove you will not get error when you deleting.
    private int id;
    private String name;
    private String clientName;

    @JsonIgnore
    @ManyToMany(mappedBy = "projects")
    private List<employee> employees;

    public project(){

    }

    public project(String name, String clientName) {
        this.name = name;
        this.clientName = clientName;
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

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public List<employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<employee> employees) {
        this.employees = employees;
    }

}
