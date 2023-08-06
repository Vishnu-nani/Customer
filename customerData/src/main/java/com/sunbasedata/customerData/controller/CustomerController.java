package com.sunbasedata.customerData.controller;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ConcurrentModel;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.sunbasedata.customerData.entity.Customer;
import com.sunbasedata.customerData.service.CustomerService;

@Controller
public class CustomerController {
	
	@Autowired
	private CustomerService service;
	

	@GetMapping(value="/")
	public String homePage() {
		return "home.jsp";
	}
	
	@PostMapping("/loginadmin")
	public String adminLogin(@RequestParam("mail") String admin,@RequestParam("password") String pass) {
		if(admin.equals("test@sunbasedata.com")&& pass.equals("Test@123"))
			return "details.jsp";
		return "loginfail.jsp";
	}
	
	@PostMapping("/addCustomers")
	public String addCustomers(Customer cus) {
		service.addCustomers(cus);
//		
		return "successAdded.jsp";
	}
	
	@GetMapping("/getCustomers")
	public String getAllCustomers(Model mod){
		List<Customer> allcustomers = service.getAllcustomers();
		mod.addAttribute("allcustomers", allcustomers);
		return "displayCustomer.jsp";
		 
	}
	
	@GetMapping("/deleteCustomer/{id}")
	public String deleteCustomer(@PathVariable("id")int id, Model mod) {
		
		service.deleteCustomer(id);
//		mod.addAttribute("allCustomers", deleteCustomer);
		return "redirect:/getCustomers";
	}
	
	@GetMapping("/getByName/{id}")
	public String getByName(@PathVariable("id") int id,Model mod) {
		System.out.println(id);
		Customer customer=service.getByid(id);	
		mod.addAttribute("cus", customer);
		return "/editCustomer.jsp";
		
		
	}
	
	@GetMapping("getByName/updateCustomer")
	public String updateCustomer( Customer cus) {
		service.updateCustomer(cus);
		
		
		return "/getCustomers";
	}
}
