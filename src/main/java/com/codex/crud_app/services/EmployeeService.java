package com.codex.crud_app.services;

import com.codex.crud_app.entity.Employee;

import java.util.List;

public interface EmployeeService {



   public List<Employee> getAllEmployee();

   public  Employee addEmployee(Employee employee);


}
