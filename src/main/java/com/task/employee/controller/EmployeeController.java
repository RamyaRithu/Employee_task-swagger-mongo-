package com.task.employee.controller;

import com.task.employee.entity.Employee;
import com.task.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/create")
    public Employee createEmployee(@RequestBody Employee employee) {
    return employeeService.addEmployee(employee);



    }
    @GetMapping("displayAll")
    public List<Employee> getAllEmployee(){
        return employeeService.getAllEmployees();

    }
    @GetMapping("/displayId")
    public Employee getEmployeeById(String id){
        return employeeService.getEmployeeById(id);
    }


}
