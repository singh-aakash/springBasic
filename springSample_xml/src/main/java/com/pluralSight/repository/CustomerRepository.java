package com.pluralSight.repository;

import java.util.List;

import com.pluralSight.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}