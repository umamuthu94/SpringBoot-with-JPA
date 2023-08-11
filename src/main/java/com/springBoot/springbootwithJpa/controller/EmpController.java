package com.springBoot.springbootwithJpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springBoot.springbootwithJpa.model.Employee;
import com.springBoot.springbootwithJpa.service.EmpService;

@RestController
public class EmpController {

    @Autowired
    EmpService service;

     @PostMapping("/create")
    public Employee saveEmployee(@RequestBody Employee empDetails) {
       Employee employee2 = service.saveEmployee(empDetails);
       return employee2; 
    }

    @GetMapping("/listOfEmployee")
     public List<Employee> getAllEmployees() {
        return service.getAllEmployees();
    }

    @GetMapping("/findById/{id}")
   public Employee getById(@RequestParam Integer id) {
      return service.getDetailsById(id);
   }
    
   @PutMapping("/update/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable Integer id, @RequestBody Employee updateEmployee) {
        Employee updated = service.updateEmployee(id, updateEmployee);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/deletedetails")
    public void deleteEmployee(Integer id) {
        service.deleteEmployee(id);
    }
}
