package com.foodinminutes.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodinminutes.Model.Customer;

public interface CustomerRepo extends JpaRepository<Customer,Integer>{
    
    
}
