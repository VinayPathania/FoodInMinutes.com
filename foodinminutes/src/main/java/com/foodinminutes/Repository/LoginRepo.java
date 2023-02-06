package com.foodinminutes.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodinminutes.Model.CurrentLoginSession;

public interface LoginRepo extends JpaRepository<CurrentLoginSession,Integer>{
    
    
}
