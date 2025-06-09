package com.ems.service;

import com.ems.entity.Employee;

import java.util.List;
import java.util.Optional;


public interface EmployeeService {
    public List<Employee> getAllEmployees();
    public Optional<Employee> getEmployeeById(Long id);
    public Employee saveEmployee(Employee emp);
    public void deleteEmployee(Long id);
}
