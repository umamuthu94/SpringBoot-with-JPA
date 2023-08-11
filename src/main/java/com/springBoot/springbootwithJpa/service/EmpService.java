package com.springBoot.springbootwithJpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springBoot.springbootwithJpa.model.Employee;
import com.springBoot.springbootwithJpa.repository.EmpRepo;

@Service
public class EmpService {

    @Autowired
    EmpRepo empRepo;


    
    public Employee saveEmployee(Employee employee) {
        Employee employee2 = empRepo.save(employee);
        return employee2;
    }

    public List<Employee> getAllEmployees(){
        return empRepo.findAll();
    }
    

    public Employee getDetailsById(Integer id) {
        Employee employee2 = empRepo.findById(id).orElse(null);
   return employee2;
    }

   public void deleteEmployee(Integer id) {
   empRepo.deleteById(id);
    }

public Employee updateEmployee(Integer id, Employee empDetails) {
    Employee updateEmployee = empRepo.findById(id).get();
    updateEmployee.setName(empDetails.getName());
    updateEmployee.setAge(empDetails.getAge());
    updateEmployee.setMnumber(empDetails.getMnumber());
    updateEmployee.setAddress(empDetails.getAddress());
    updateEmployee.setSalary(empDetails.getSalary());
    return empRepo.save(updateEmployee);
}
    
}
