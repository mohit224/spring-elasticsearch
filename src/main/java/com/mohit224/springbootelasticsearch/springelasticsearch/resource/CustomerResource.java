package com.mohit224.springbootelasticsearch.springelasticsearch.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mohit224.springbootelasticsearch.springelasticsearch.model.Customer;
import com.mohit224.springbootelasticsearch.springelasticsearch.repo.CustomerRepository;

@RestController
@RequestMapping("es/customer")
public class CustomerResource {

	@Autowired
	private CustomerRepository customerRepository;

	@PostMapping(value = "/save", produces = {
			MediaType.APPLICATION_JSON_VALUE }, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void saveCustomer(@RequestBody List<Customer> customers) {
		customerRepository.saveAll(customers);

		customerRepository.findAll().forEach(System.out::println);
	}

	@GetMapping("/all")
	public Iterable<Customer> findAllCustomers() {
		return customerRepository.findAll();
	}

	@GetMapping("/findByName/{firstName}")
	public List<Customer> findByName(@PathVariable String firstName) {
		return customerRepository.findByFirstName(firstName);
	}

}
