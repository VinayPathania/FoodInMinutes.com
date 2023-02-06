package com.foodinminutes.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodinminutes.Model.Bill;

public interface BillRepo extends JpaRepository<Bill,Integer> {
    
}
