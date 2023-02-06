package com.foodinminutes.Service;

import java.util.List;

import com.foodinminutes.Exception.CustomerNotFoundException;
import com.foodinminutes.Model.Customer;

public interface CustomerService {
    public Customer addCustomer(Customer customer)throws CustomerNotFoundException;
	
	public Customer updateCustomer(Customer customer)throws CustomerNotFoundException;
	
	public Customer removeCustomer(Integer customerId)throws CustomerNotFoundException;
	
	public Customer viewCustomer(Integer customerId)throws CustomerNotFoundException;

    public List<Customer>  viewAllCustomer()throws CustomerNotFoundException;
}
