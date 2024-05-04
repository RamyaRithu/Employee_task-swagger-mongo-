package com.task.employee.service;

import com.task.employee.entity.Employee;
import com.task.employee.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepo employeeRepo;

    public Employee addEmployee(Employee employee) {
        employee.setId(UUID.randomUUID().toString().split("-")[0]);
        return employeeRepo.save(employee);
    }


    public List<Employee> getAllEmployees() {
        return employeeRepo.findAll();
    }
    public Employee getEmployeeById(String id) {
        return employeeRepo.findById(id).get();
    }

}
