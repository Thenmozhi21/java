package com.serviceimpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.exception.OrdersNotFoundException;
import com.model.Orders;
import com.repository.OrderRepository;
import com.service.OrderService;

public class OrderServiceImpl implements OrderService
{
	@Autowired
	OrderRepository orderrepo;
	
	@Override
	// save Order details using order repository object
	public Orders saveOrders(Orders orders) {
		
		return orderrepo.save(orders);
	}

	@Override
	// fetch all Order details using order repository object
	public List<Orders> getAllOrdersDetails() {
		
		return orderrepo.findAll();
	}

	@Override
	// fetch specify Order details using order repository object
	public Orders getOrderById(int id) {
		//getting Order by id, if not present throw custom exception
	    return orderrepo.findById(id).orElseThrow(() -> new OrdersNotFoundException("Entered Order id is not present in table"));
			
	}

	@Override
	// fetch specify Order details & delete it using order repository object
	public void deleteOrderById(int id) {
		//Deleting Order by id, if not present throw custom exception
		orderrepo.findById(id).orElseThrow(() -> new OrdersNotFoundException("Entered Order id is not present in table"));
		orderrepo.deleteById(id);
	}

	@Override
	// fetch specify Order details & update it using order repository object
	public Orders updateOrderById(Orders orders, int id) {
		//Updating Order by id, if not present throw custom exception
    Orders existingorders= orderrepo.findById(id).orElseThrow(() -> new OrdersNotFoundException("Entered Order id is not present in table"));
		
		//set new value
	    existingorders.setCname(orders.getCname());
	    existingorders.setCphone(orders.getCphone());
	    existingorders.setBookpur(orders.getBookpur());
	    existingorders.setTprice(orders.getTprice());
		
	    orderrepo.save(existingorders);
		return existingorders;
	}

	@Override
	// fetch specify Order details with Customer name using order repository object
	public Orders getOrdersByCustomername(String Cname) {
		
		return orderrepo.getOrdersByCustomername(Cname);
	}

	@Override
	public Orders getOrdersByCustomerphone(long Cphone) {
		
		return orderrepo.getOrdersByCustomerphone(Cphone);
	}

	
	
}
