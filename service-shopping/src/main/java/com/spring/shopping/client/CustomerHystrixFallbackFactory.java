package com.spring.shopping.client;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.spring.shopping.model.Customer;

@Component
public class CustomerHystrixFallbackFactory  implements CustomerClient{
    @Override
    public ResponseEntity<Customer> getCustomer(long id) {
        Customer customer = new Customer("none","none","none","none");  		
        return ResponseEntity.ok(customer);
    }
}
