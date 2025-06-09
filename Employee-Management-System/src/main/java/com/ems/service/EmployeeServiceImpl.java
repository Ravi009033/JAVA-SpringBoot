package com.ems.service;

import com.ems.entity.Employee;
import com.ems.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRepo repo;

    //get all employees for database
    @Override
    public List<Employee> getAllEmployees() {
        return repo.findAll();
    }

    //get employee by ID
    @Override
    public Optional<Employee> getEmployeeById(Long id) {
        return repo.findById(id);
    }

    //Add employee to databse
    @Override
    public Employee saveEmployee(Employee emp) {
        return repo.save(emp);
    }

    //delete employee from database
    @Override
    public void deleteEmployee(Long id) {
        repo.deleteById(id);
    }
}
