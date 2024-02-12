package com.jsp.medishop.dao;

import java.util.List;

import com.jsp.medishop.dto.Customer;

public interface CustomerDao 
{
	public Customer saveCustomerDao(Customer customer);
	
	public Customer getCustomerById(int customerId);
	
	public List<Customer> getAllCustomer();
	
	public Customer getCustpmerByEmailDao(String customerEmail);
	
	public Customer updateCustomerByEmailDao(Customer customer);
	
	public Boolean deleteCustomerByIdDao(int customerId);

}
