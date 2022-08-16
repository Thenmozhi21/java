package com.service;

import java.util.List;
import com.model.Orders;

public interface OrderService {

	Orders saveOrders(Orders orders); //save orders details
	 
	List<Orders> getAllOrdersDetails(); //fetching all orders details 
	
	Orders getOrderById(int id);//fetching orders details based on id
	
	void deleteOrderById(int id);//delete orders details based on id
	
	Orders updateOrderById(Orders orders, int id);//change orders details based on id
	
	Orders getOrdersByCustomername(String Cname);//fetching orders details based on customer name
	
	Orders getOrdersByCustomerphone(long Cphone); //fetching orders details based on customer phone
}
