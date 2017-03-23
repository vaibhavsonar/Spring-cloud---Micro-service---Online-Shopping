/**
 * 
 */
package com.opus.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.opus.model.Product;

/**
 * @author Vaibhav.Sonar
 *
 */
@RestController
public class ProductController {

	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping(value = "/dummyProducts", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Product>> getGreetingMessage() {

		List<Product> products = new ArrayList<>();
		products.add(new Product(1, "A"));
		products.add(new Product(2, "B"));
		products.add(new Product(3, "C"));
		products.add(new Product(4, "D"));
		products.add(new Product(5, "E"));

		return new ResponseEntity<List<Product>>(products, HttpStatus.OK);
	}
}
