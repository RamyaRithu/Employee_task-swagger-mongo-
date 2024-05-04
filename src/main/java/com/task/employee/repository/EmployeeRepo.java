package com.task.employee.repository;

import com.task.employee.entity.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Repository;


public interface EmployeeRepo extends MongoRepository<Employee,String> {


}
