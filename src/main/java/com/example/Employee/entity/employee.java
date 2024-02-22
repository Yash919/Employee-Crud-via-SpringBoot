package com.example.Employee.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int employeeId;
    String employeeName;
    String employeeCity;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_spouse")
    private spouse spouse;

    @OneToMany(cascade = CascadeType.ALL)
    private List<address> addresses;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "employee_project",
            joinColumns = @JoinColumn(name="fk_employee"),
            inverseJoinColumns = @JoinColumn(name = "fk_project"))
    private List<project> projects;

    public employee(){

    }

    public employee(int employeeId, String employeeName, String employeeCity) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeCity = employeeCity;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeCity() {
        return employeeCity;
    }

    public void setEmployeeCity(String employeeCity) {
        this.employeeCity = employeeCity;
    }

    public com.example.Employee.entity.spouse getSpouse() {
        return spouse;
    }

    public void setSpouse(com.example.Employee.entity.spouse spouse) {
        this.spouse = spouse;
    }

    public List<address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<address> addresses) {
        this.addresses = addresses;
    }

    public void removeProject(project project){
        this.projects.remove(project);
        project.getEmployees().remove(project);
    }

    public void addProject(project project){
        this.projects.add(project);
        project.getEmployees().add(this);
    }

    public List<project> getProjects() {
        return projects;
    }

    public void setProjects(List<project> projects) {
        this.projects = projects;
    }
}
