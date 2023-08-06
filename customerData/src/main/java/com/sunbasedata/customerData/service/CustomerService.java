package com.sunbasedata.customerData.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunbasedata.customerData.entity.Customer;
import com.sunbasedata.customerData.repository.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	CustomerRepository res;

	public void addCustomers(Customer cus) {
		res.save(cus);
	}
	
	public List<Customer> getAllcustomers(){
		List<Customer> findAll = res.findAll();
		return findAll;
	}
	public List<Customer> deleteCustomer(int id){
		res.deleteByid(id);
		return res.findAll();
	}
	
	public Customer getByid(int id) {
		Customer byName = res.getByid(id);
		return byName;
	}
	
	public void updateCustomer(Customer cus) {
		res.save(cus);
		
		
		
	}
}
