package com.foodinminutes.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodinminutes.Model.Restaurant;

public interface RestaurantRepo extends JpaRepository<Restaurant,Integer> {
    
}
