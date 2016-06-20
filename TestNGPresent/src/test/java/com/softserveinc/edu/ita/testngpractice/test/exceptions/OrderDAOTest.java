package com.softserveinc.edu.ita.testngpractice.test.exceptions;

import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.softserveinc.edu.ita.testngpractice.order.Order;
import com.softserveinc.edu.ita.testngpractice.order.OrderDAO;
import com.softserveinc.edu.ita.testngpractice.order.OrderNotFoundException;
import com.softserveinc.edu.ita.testngpractice.order.OrderSaveException;
import com.softserveinc.edu.ita.testngpractice.order.OrderUpdateException;

public class OrderDAOTest {
	
	OrderDAO orderDAO;
	Order data;
	
	@BeforeTest
	public void setup(){
		orderDAO = new OrderDAO();
		
	}
	
	@Test(expectedExceptions=OrderSaveException.class)
	public void testIfOrderIsNull() throws OrderSaveException{
		
		orderDAO.save(null);
	}
	
	@BeforeGroups("orderNotExists")
	public void beforeTestOrderNotExists(){
		
		data = new Order();
		
	}
	
	@Test(groups ={"orderNotExists"},expectedExceptions={OrderNotFoundException.class,OrderUpdateException.class})
	public void testIfOrderNotExists() throws OrderUpdateException, OrderNotFoundException{
		orderDAO.update(data);
	}
	
  
}
