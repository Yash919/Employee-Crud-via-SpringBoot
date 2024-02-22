package com.example.Employee.service;

import com.example.Employee.entity.address;
import com.example.Employee.entity.employee;
import com.example.Employee.repository.employeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class employeeService {

    // ArrayList
    List<employee> employeeList= new ArrayList<>(Arrays.asList(
            new employee(1,"Yash Mehta","India"),
            new employee(2,"Paulo Dybala","Argentina")
    ));

    @Autowired
    employeeRepository employeeRepository;

    public List<employee> getAllEmployee(){
        /*
        // To find for an arrayList
        return employeeList;
        */
        // via JPA
        return employeeRepository.findAll();
    }

    // To find an employee
    public employee getAnEmployee(int id){

        /*
        // To find for an arrayList
        return employeeList.stream().filter(e->(e.getEmployeeId()==id)).findFirst().get();
        */

        // via JPA
        return employeeRepository.findById(id).orElse(new employee());
    }

    // To create an employee
    public void createEmployee(employee employee){
        /*
        // To insert in arrayList
        employeeList.add(employee);
         */

        /*
        // Doing via JPA
        employeeRepository.save(employee);
        */

        // Cascade
        ArrayList<address> addressArrayList=new ArrayList<>();

        for(address address:employee.getAddresses()){
            addressArrayList.add((new address(address.getLine1(),address.getLine2(),
                    address.getZipCode(),address.getCity(),
                    address.getState(),address.getCountry()
                    ,employee)));
        }

        employee.setAddresses(addressArrayList);

        employeeRepository.save(employee);

    }

    // To update an employee
    public void updateEmployee(employee employee){
        /*
        // To insert in arrayList
        List<employee> tempEmployee=new ArrayList<>();
        for(employee emp: employeeList){
            if(emp.getEmployeeId()==employee.getEmployeeId()){
                emp.setEmployeeName(employee.getEmployeeName());
                emp.setEmployeeCity(employee.getEmployeeCity());
            }
            tempEmployee.add(emp);
        }
        this.employeeList=tempEmployee;
        */

        // via jpa
        employeeRepository.save(employee);
    }


    public void deleteEmployee(int id){
        /*
        // To delete in arrayList
        List<employee> tempEmployee=new ArrayList<>();
        for(employee emp:employeeList){
            if(emp.getEmployeeId()==id){
                continue;
            }
            tempEmployee.add(emp);
        }
        this.employeeList=tempEmployee;
        */

        // via JPA
        employeeRepository.deleteById(id);
    }
}
