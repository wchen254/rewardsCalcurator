package com.example.service.rewardCalcurator.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.server.ResponseStatusException;

import com.example.service.rewardCalcurator.model.Customer;

@CrossOrigin(origins="http://localhost:8080")
@RestController
public class RewardsController {
	
	@Autowired
	private RewardsService rewardsService;

	@GetMapping("/customers")
	public List<Customer> findCustomerAll() {
		return rewardsService.getCustomerAll();
	}
	
	@GetMapping("/customers/{id}")
	public ResponseEntity getCustomer(@PathVariable Integer id) {
		Customer customer = rewardsService.getCustomerById(id);
		if (customer == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("entity not found");
		}
		return new ResponseEntity<Customer>(customer, HttpStatus.OK);
	}

	@GetMapping("/customers/rewardP/{id}")
	public Double getCustomerPoint(@PathVariable Integer id) {
		Customer customer = rewardsService.getCustomerById(id);

		if (customer == null) {
			throw new ResponseStatusException(
					HttpStatus.NOT_FOUND, "entity not found"
			);
		}
		Double point = customer.getRewardPoints();
		return point;
	}

	@GetMapping("/customers/totalP/{id}")
	public Double getTotalPurchase(@PathVariable Integer id) {
		Customer customer = rewardsService.getCustomerById(id);

		if (customer == null) {
			throw new ResponseStatusException(
					HttpStatus.NOT_FOUND, "entity not found"
			);
		}
		Double purchase = customer.getTotalPurchases();
		return purchase;
	}
	
}
