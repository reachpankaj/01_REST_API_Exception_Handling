package com.pankaj.service;

import org.springframework.stereotype.Service;

import com.pankaj.exception.CustomerNotFoundException;

@Service
public class CustomerService {
	
	public String getCustomerNameById(Integer customerId) {
		if(customerId >=100) {
			return "Sani";
		}else {
			throw new CustomerNotFoundException("Invalid Customer Id");
			
		}
	}

}
