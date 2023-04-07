package com.ravi.EmployeeCRUD.EmployeeDirectory.service;

import com.ravi.EmployeeCRUD.EmployeeDirectory.entity.Employee;

import java.util.List;

public interface EmployeeService {
    void save(Employee theEmployee);
    Employee findById(Integer theId);
    List<Employee> findAll();
    void update(Employee theEmployee);
    void delete(Integer theId);
}