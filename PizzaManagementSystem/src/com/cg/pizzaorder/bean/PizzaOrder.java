package com.cg.pizzaorder.bean;

public class PizzaOrder {

	private int orderid;
	private int customerid;
	private double totalprice;
	
	
	PizzaOrder()
	{
		
	}

	

	public PizzaOrder(int orderid, int customerid, double totalprice) {
		super();
		this.orderid = orderid;
		this.customerid = customerid;
		this.totalprice = totalprice;
	}



	public int getOrderid() {
		return orderid;
	}


	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}


	public int getCustomerid() {
		return customerid;
	}


	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}


	public double getTotalprice() {
		return totalprice;
	}


	public void setTotalprice(double totalprice) {
		this.totalprice = totalprice;
	}


	@Override
	public String toString() {
		return "PizzaOrder [orderid=" + orderid + ", customerid=" + customerid + ", totalprice=" + totalprice + "]";
	}
	
	
	
	
}
