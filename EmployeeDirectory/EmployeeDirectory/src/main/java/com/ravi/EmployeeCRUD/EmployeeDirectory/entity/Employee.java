package com.ravi.EmployeeCRUD.EmployeeDirectory.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="employee")
public class Employee {

    // define fields
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="gender")
    private String gender;

    @Column(name = "department")
    private String department;

    @Column(name="DOB")
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date DOB;

    // define constructors

    public Employee() {
    }

    public Employee(String firstName, String lastName, String gender, String department, Date DOB) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.department = department;
        this.DOB = DOB;
    }

    // define getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Date getDOB() {
        return DOB;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }


    // define toString() method


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", department='" + department + '\'' +
                ", DOB=" + DOB +
                '}';
    }
}

