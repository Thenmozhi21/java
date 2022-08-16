package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.model.Orders;

public interface OrderRepository extends JpaRepository<Orders, Integer>
{
	// fetch Orders by customer name from data base table using @query
	@Query("select o from Orders o where o.Cname=?1")
	Orders getOrdersByCustomername(String Cname) ;
	
	// fetch Orders by customer name from data base table using @query
	@Query("select o from Orders o where o.Cphone=?1")
	Orders getOrdersByCustomerphone(long cphone) ;
	
}
