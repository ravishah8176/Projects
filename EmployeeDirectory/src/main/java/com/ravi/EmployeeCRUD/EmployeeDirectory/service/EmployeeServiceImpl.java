package com.ravi.EmployeeCRUD.EmployeeDirectory.service;

import com.ravi.EmployeeCRUD.EmployeeDirectory.dao.EmployeeDAO;
import com.ravi.EmployeeCRUD.EmployeeDirectory.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    private EmployeeDAO theEmployeeDAO;

    @Autowired
    public EmployeeServiceImpl(EmployeeDAO employeeDAO){
        theEmployeeDAO = employeeDAO;
    }

    @Transactional
    @Override
    public void save(Employee theEmployee) {
        theEmployeeDAO.save(theEmployee);
    }

    @Transactional
    @Override
    public Employee findById(Integer theId) {
        return theEmployeeDAO.findById(theId);
    }

    @Transactional
    @Override
    public List<Employee> findAll() {
        return theEmployeeDAO.findAll();
    }

    @Transactional
    @Override
    public void update(Employee theEmployee) {
        theEmployeeDAO.update(theEmployee);
    }

    @Transactional
    @Override
    public void delete(Integer theId) {
        theEmployeeDAO.delete(theId);
    }
}
