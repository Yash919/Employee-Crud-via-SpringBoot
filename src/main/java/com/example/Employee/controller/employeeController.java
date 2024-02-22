package com.example.Employee.controller;

import com.example.Employee.entity.employee;
import com.example.Employee.service.employeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class employeeController {

    @Autowired
    employeeService employeeService;

    @RequestMapping("/employees")  // By Default Request Mapping is get request
    public List<employee> findAllEmployee(){
        return employeeService.getAllEmployee();
    }

    @RequestMapping("/employee/{id}")
    public employee employeeDetail(@PathVariable int id){
        return employeeService.getAnEmployee(id);
    }

    //@PostMapping     - > can be used
    @RequestMapping(value = "/createEmployee",method = RequestMethod.POST)
    public void createEmployee(@RequestBody employee employee){
        employeeService.createEmployee(employee);
    }

    //@PutMapping       - > can be used
    @RequestMapping(value="/updateEmployee/{id}",method = RequestMethod.PUT)
    public void updateEmployee(@PathVariable int id,@RequestBody employee employee){
        employeeService.updateEmployee(employee);
    }

    //@DeleteMapping    - >  can be used
    @RequestMapping(value="/deleteEmployee/{id}",method = RequestMethod.DELETE)
    public void deleteEmployee(@PathVariable int id){
        employeeService.deleteEmployee(id);
    }
}
