package com.foodinminutes.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodinminutes.Model.Foodcart;

public interface FoodCartRepo extends JpaRepository<Foodcart,Integer>{
    
}
