package com.ravi.EmployeeCRUD.EmployeeDirectory.dao;

import com.ravi.EmployeeCRUD.EmployeeDirectory.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    void save(Employee theEmployee);
    Employee findById(Integer theId);
    List<Employee> findAll();

    void update(Employee theEmployee);

    void delete(Integer theId);

}