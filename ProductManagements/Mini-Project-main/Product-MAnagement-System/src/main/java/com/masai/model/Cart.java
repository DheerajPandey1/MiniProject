package com.masai.model;

import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToOne;

public class Cart {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer cartId;	
	
	
	private Double cartTotal;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Customer customer;

	public Integer getCartId() {
		return cartId;
	}

	public void setCartId(Integer cartId) {
		this.cartId = cartId;
	}

	public Double getCartTotal() {
		return cartTotal;
	}

	public void setCartTotal(Double cartTotal) {
		this.cartTotal = cartTotal;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Cart(Integer cartId, Double cartTotal, Customer customer) {
		super();
		this.cartId = cartId;
		this.cartTotal = cartTotal;
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Cart [cartId=" + cartId + ", cartTotal=" + cartTotal + ", customer=" + customer + "]";
	}
	
	public Cart() {
		
	}
}
