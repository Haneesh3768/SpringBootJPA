package com.klef.jfsd.exam.service;

import java.util.List;

import com.klef.jfsd.exam.model.Customer;

public interface CustomerService 
{
	public String addcustomer(Customer customer);
	public List<Customer> viewall();
}
