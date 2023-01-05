package com.masai.model;

import java.time.LocalDate;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;

public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer orderId;
	@PastOrPresent
	private LocalDate date;
	@NotNull
	@Enumerated(EnumType.STRING)
	
	
	private Double total;
	
	private String cardNumber;

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public Order(Integer orderId, @PastOrPresent LocalDate date, @NotNull Double total, String cardNumber) {
		super();
		this.orderId = orderId;
		this.date = date;
		this.total = total;
		this.cardNumber = cardNumber;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", date=" + date + ", total=" + total + ", cardNumber=" + cardNumber + "]";
	}
	
	public Order() {
			
	}
	
}

