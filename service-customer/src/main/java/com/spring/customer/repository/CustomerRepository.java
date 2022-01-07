package com.spring.customer.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.customer.repository.entity.Customer;
import com.spring.customer.repository.entity.Region;

public interface CustomerRepository  extends JpaRepository<Customer,Long> {
        public Customer findByNumberID(String numberID);
        public List<Customer> findByLastName(String lastName);
        public List<Customer> findByRegion(Region region);
}
