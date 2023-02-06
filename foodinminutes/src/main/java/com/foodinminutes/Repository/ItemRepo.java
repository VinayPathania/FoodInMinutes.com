package com.foodinminutes.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodinminutes.Model.Item;

public interface ItemRepo extends JpaRepository<Item,Integer>{
    
}
