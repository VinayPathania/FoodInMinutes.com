package com.foodinminutes.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodinminutes.Model.Category;

public interface CategoryRepo extends JpaRepository<Category,Integer>{
    
}
