package com.cg.pizzaorder.bean;

public class Customer {
	
	private int orderid;
	private int customerId;
	private double totalPrice;
	
	
	Customer()
	{
		orderid=(int) Math.random();
	}


	public Customer(int orderid, int customerId, double totalPrice) {
		super();
		this.orderid = orderid;
		this.customerId = customerId;
		this.totalPrice = totalPrice;
	}


	public int getOrderid() {
		return orderid;
	}


	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}


	public int getCustomerId() {
		return customerId;
	}


	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}


	public double getTotalPrice() {
		return totalPrice;
	}


	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}


	@Override
	public String toString() {
		return "Customer [orderid=" + orderid + ", customerId=" + customerId + ", totalPrice=" + totalPrice + "]";
	}

	
	
}
