package com.mohit224.springbootelasticsearch.springelasticsearch.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(indexName = "mohit224", type = "customer", shards = 2)
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Customer {

	@Id
	private String id;
	private String firstName;
	private String lastName;
	private int age;

}
