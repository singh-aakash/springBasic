package com.pluralSight.service;

import java.util.List;

import com.pluralSight.Customer;
import com.pluralSight.repository.CustomerRepository;
import com.pluralSight.repository.HibernateCustomerRepository;

public class CustomerServiceImpl implements CustomerService {
	
	private CustomerRepository customerRepository = (CustomerRepository) new HibernateCustomerRepository();
	
	/* (non-Javadoc)
	 * @see com.pluralSight.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}
}
