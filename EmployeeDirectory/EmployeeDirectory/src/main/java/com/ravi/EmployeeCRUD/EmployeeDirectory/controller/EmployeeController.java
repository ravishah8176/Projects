package com.ravi.EmployeeCRUD.EmployeeDirectory.controller;


import com.ravi.EmployeeCRUD.EmployeeDirectory.entity.Employee;
import com.ravi.EmployeeCRUD.EmployeeDirectory.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class EmployeeController {
    @Autowired
    private EmployeeService theEmployeeService;

    @GetMapping("/employee")
    public String list(){
        return theEmployeeService.findAll().toString();
    }

    @GetMapping("/employee/{theId}")
    public String findById(@PathVariable int theId){
        return theEmployeeService.findById(theId).toString();
    }

    @PostMapping("/employee")
    public String save(@RequestBody Employee theEmployee){
        theEmployeeService.save(theEmployee);
        return theEmployee.toString();
    }

    @PutMapping("/employee")
    public String update(@RequestBody Employee theEmployee){
        theEmployeeService.update(theEmployee);
        return theEmployee.toString();
    }

    @DeleteMapping("/employee/{theId}")
    public String deleteById(@PathVariable Integer theId){
        String ans = theEmployeeService.findById(theId).toString();
        theEmployeeService.delete(theId);
        return ans;
    }


}

