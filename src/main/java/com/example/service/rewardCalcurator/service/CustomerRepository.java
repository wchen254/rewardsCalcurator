package com.example.service.rewardCalcurator.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.service.rewardCalcurator.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
