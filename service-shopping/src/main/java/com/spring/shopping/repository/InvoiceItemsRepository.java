package com.spring.shopping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.shopping.entity.InvoiceItem;

public interface InvoiceItemsRepository extends JpaRepository<InvoiceItem,Long> {
}
