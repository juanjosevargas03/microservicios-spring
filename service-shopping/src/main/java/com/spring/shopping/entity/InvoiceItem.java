package com.spring.shopping.entity;

//import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Positive;

import com.spring.shopping.model.Product;

import java.io.Serializable;

//@Data
@Entity
@Table(name = "tbl_invoce_items")
public class InvoiceItem  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Positive(message = "El stock debe ser mayor que cero")
    private Double quantity;
    private Double  price;

    @Column(name = "product_id")
    private Long productId;


    @Transient
    private Double subTotal;

    @Transient
    private Product product;

    public Double getSubTotal(){
        if (this.price >0  && this.quantity >0 ){
            return this.quantity * this.price;
        }else {
            return (double) 0;
        }
    }
    public InvoiceItem(){
        this.quantity=(double) 0;
        this.price=(double) 0;

    }
	public InvoiceItem(Long id, @Positive(message = "El stock debe ser mayor que cero") Double quantity, Double price,
			Long productId, Double subTotal) {
		super();
		this.id = id;
		this.quantity = quantity;
		this.price = price;
		this.productId = productId;
		this.subTotal = subTotal;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long invoice_id) {
		this.id = invoice_id;
	}
	
	
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public Double getQuantity() {
		return quantity;
	}
	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Long getProductId() {
		return productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	public void setSubTotal(Double subTotal) {
		this.subTotal = subTotal;
	}
    
    
    
    
}
