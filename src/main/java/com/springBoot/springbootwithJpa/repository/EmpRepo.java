package com.springBoot.springbootwithJpa.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.springBoot.springbootwithJpa.model.Employee;

public interface EmpRepo extends JpaRepository<Employee,Integer>{

    
    
}
