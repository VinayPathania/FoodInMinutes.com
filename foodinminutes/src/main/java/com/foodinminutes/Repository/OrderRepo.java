package com.foodinminutes.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodinminutes.Model.OrderDetails;

public interface OrderRepo extends JpaRepository<OrderDetails,Integer>{
    
}
