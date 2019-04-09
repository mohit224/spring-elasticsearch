package com.mohit224.springbootelasticsearch.springelasticsearch.repo;

import java.util.List;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.mohit224.springbootelasticsearch.springelasticsearch.model.Customer;

public interface CustomerRepository extends ElasticsearchRepository<Customer, String> {

	List<Customer> findByFirstName(String firstName);

}
