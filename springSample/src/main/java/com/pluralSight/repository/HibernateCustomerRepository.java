package com.pluralSight.repository;

import java.util.ArrayList;
import java.util.List;

import com.pluralSight.Customer;

public class HibernateCustomerRepository implements CustomerRepository {

	/* (non-Javadoc)
	 * @see com.pluralSight.repository.CustomerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		List<Customer> customers = new ArrayList<>();
		Customer customer = new Customer();
		
		customer.setFirstName("Aakash");
		customer.setLastName("HanSen");
		
		customers.add(customer);
		
		return customers;
	}
}
