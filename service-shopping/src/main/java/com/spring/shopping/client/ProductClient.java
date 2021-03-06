package com.spring.shopping.client;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.shopping.model.Product;

//@RequestMapping(value = "/products")
@FeignClient(name = "service-product")
public interface ProductClient {

    //@GetMapping(value = "/{id}")
    @RequestMapping(method =  RequestMethod.GET,value = "/products/{id}")
    public ResponseEntity<Product> getProduct(@PathVariable("id") Long id);

    //@GetMapping(value = "/{id}/stock")
    @RequestMapping(method =  RequestMethod.PUT,value = "/products/{id}/stock")
    public ResponseEntity<Product> updateStockProduct(@PathVariable  Long id ,@RequestParam(name = "quantity", required = true) Double quantity);
    }
