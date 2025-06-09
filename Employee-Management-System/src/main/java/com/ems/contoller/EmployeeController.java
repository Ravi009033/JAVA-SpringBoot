package com.ems.contoller;


import com.ems.entity.Employee;
import com.ems.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    //get all employee
    @GetMapping("/employees")
    public List<Employee> getAllEmployeesDetails(){
        return employeeService.getAllEmployees();
    }

    //get employee for particular ID
    @GetMapping("/employees/{id}")
    public ResponseEntity<Employee> get(@PathVariable Long id){
        Employee employee = employeeService.getEmployeeById(id).orElse(null);
        if(employee != null) {
            return ResponseEntity.ok().body(employee);
        }
        else {
            return ResponseEntity.notFound().build();
        }
    }

    //add employee to database
    @PostMapping("/employees/add")
    public Employee create(@RequestBody Employee emp) {
        return employeeService.saveEmployee(emp);
    }

    //update the details of employee
    @PutMapping("/employees/{id}")
    public ResponseEntity<Employee> update(@PathVariable Long id, @RequestBody Employee updated){
        Optional<Employee> optional = employeeService.getEmployeeById(id);
        if (optional.isPresent()) {
            Employee existing = optional.get();
            existing.setName(updated.getName());
            existing.setEmail(updated.getEmail());
            existing.setSalary(updated.getSalary());
            existing.setDepartment(updated.getDepartment());
            existing.setJoining_date(updated.getJoining_date());

            Employee saved = employeeService.saveEmployee(existing);
            return ResponseEntity.ok(saved);
        } else {
            return ResponseEntity.notFound().build();
        }

    }

    //delete the employee from database
    @DeleteMapping("/employees/{id}")
    public String deleteEmployee(@PathVariable Long id){
        if(employeeService.getEmployeeById(id).isPresent()) {
            employeeService.deleteEmployee(id);
            return "Successfully deleted";
        }
        return "user not found";
    }
}
