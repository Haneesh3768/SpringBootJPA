package com.klef.jfsd.exam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.klef.jfsd.exam.model.Customer;
import com.klef.jfsd.exam.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService
{

	@Autowired
	private CustomerRepository customerRepository;
	
	@Override
	public String addcustomer(Customer customer) 
	{
		customerRepository.save(customer);
		return "Customer Added Successfully";
	}

	@Override
	public List<Customer> viewall() {
		return (List<Customer>) customerRepository.findAll();
		
	}

}
