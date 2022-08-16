package com.controller;

import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.model.Orders;
import com.service.OrderService;
public class OrderController {

	@Autowired
	private OrderService orderservice;
	
	    // inserting  order details using post mapping	
		@PostMapping("/saveOrders")
		public ResponseEntity<Orders> saveOrders(@Valid @RequestBody Orders orders){
			return new ResponseEntity<Orders>(orderservice.saveOrders(orders),HttpStatus.CREATED);
		}
		
		//fetching all order details details using get mapping
		@GetMapping("/getAllOrdersDetails")
		public List<Orders> getAllOrdersDetails(){
			return orderservice.getAllOrdersDetails();
		}
		//fetching order details by id using get mapping
		@GetMapping("/getOrderById/{id}")
		public ResponseEntity<Orders> getOrderById(@PathVariable("id") int id){
			return new ResponseEntity<Orders>(orderservice.getOrderById(id),HttpStatus.OK);
		}
		//updating order details using put mapping
		@PutMapping("/updateOrderById/{id}")
		public ResponseEntity<Orders> updateOrderById(@Valid @PathVariable("id") int id, @RequestBody Orders orders){
			return new ResponseEntity<Orders>(orderservice.updateOrderById(orders, id),HttpStatus.OK);
		}
		//deleting order details by id using delete mapping
		@DeleteMapping("/deleteOrderById/{id}")
		public ResponseEntity<String> deleteOrderById(@PathVariable("id") int id){
			orderservice.deleteOrderById(id);
			return new ResponseEntity<String>("Order details deleted successfully", HttpStatus.OK);
		}
		
		//fetching order details by customer name using get mapping
		@GetMapping("/getOrdersByCustomername/{Cname}")
		public Orders getOrdersByCustomername(@PathVariable String Cname){
			return orderservice.getOrdersByCustomername(Cname);
		}
		//fetching order details by customer phone number using get mapping
		@GetMapping("/getOrdersByCustomerphone/{Cphone}")
		public Orders getOrdersByCustomerphone(@PathVariable long Cphone){
			return orderservice.getOrdersByCustomerphone(Cphone);
		}
		
		
}
