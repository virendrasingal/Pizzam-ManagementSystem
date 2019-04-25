package com.cg.pizzaorder.dao;

import java.util.HashMap;

import com.cg.pizzaorder.bean.Customer;
import com.cg.pizzaorder.bean.PizzaOrder;
import com.cg.pizzaorder.exception.PizzaException;

public class PizzaOrderDaoImpl implements PizzaOrderDao
{

	HashMap<Integer, Customer> customerMap=new HashMap<>();
	HashMap<Integer,PizzaOrder> pizzaorderMap=new HashMap<>();
	
	
	@Override
	public int placeOrder(Customer customer, PizzaOrder pizza) throws PizzaException {
		return 0;
	}

	@Override
	public PizzaOrder getOrderDetails(int orderid) throws PizzaException {
		return null;
	}

	

}
