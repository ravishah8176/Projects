package com.ravi.EmployeeCRUD.EmployeeDirectory.dao;

import com.ravi.EmployeeCRUD.EmployeeDirectory.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO{


    private EntityManager theEntityManager;

    @Autowired
    public EmployeeDAOImpl(EntityManager entityManager){
        theEntityManager = entityManager;
    }

    @Override
    @Transactional
    public void save(Employee theEmployee) {
        theEntityManager.persist(theEmployee);
    }

    @Override
    public Employee findById(Integer theId) {
        return theEntityManager.find(Employee.class, theId);
    }

    @Override
    public List<Employee> findAll() {
        TypedQuery<Employee> theQuery = theEntityManager.createQuery("From Employee", Employee.class);
        return theQuery.getResultList();
    }

    @Override
    @Transactional
    public void update(Employee theEmployee) {
        theEntityManager.merge(theEmployee);
    }

    @Override
    public void delete(Integer theId) {
        Employee employeeTOBeDeleted = theEntityManager.find(Employee.class, theId);
        theEntityManager.remove(employeeTOBeDeleted);
    }
}