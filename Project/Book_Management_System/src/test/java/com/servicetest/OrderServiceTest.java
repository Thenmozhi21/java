package com.servicetest;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import com.model.Orders;
import com.repository.OrderRepository;
import com.service.OrderService;

@SpringBootTest
public class OrderServiceTest {

	   
	   @Autowired
	   private OrderService orderservice;
	   @MockBean
	   private OrderRepository orderrepo;
	   
	   //testing the saveOrders method
	   @Test
	   public void saveOrders() {
		   Orders b = new Orders();
		   b.setId(1);
		   b.setCname("thenmozhi");
		   b.setCphone(987654567);
		   b.setBookpur(2);
		   b.setTprice(500);
		  
		   Mockito.when(orderrepo.save(b)).thenReturn(b);
		   assertThat(orderservice.saveOrders(b)).isEqualTo(b); 
	   }
	   
	   //Testing the getAllOrdersDetails method
	   @Test
	   public void getAllOrdersDetails() {
		   Orders b1 = new Orders();
		   b1.setId(2);
		   b1.setCname("priya");
		   b1.setCphone(986654567);
		   b1.setBookpur(3);
		   b1.setTprice(600);
		   
		   Orders b2 = new Orders();
		   b2.setId(3);
		   b2.setCname("divya");
		   b2.setCphone(966654567);
		   b2.setBookpur(2);
		   b2.setTprice(500);
		   
		   //creating array list and giving object to array list 
		   List<Orders> bl = new ArrayList<Orders>();
		   //adding Books object to list
		   bl.add(b1);
		   bl.add(b2);
		   
		   Mockito.when(orderrepo.findAll()).thenReturn(bl);
		   assertThat(orderservice.getAllOrdersDetails()).isEqualTo(bl); 
		   
	   }
	   //Testing the getOrderById method
	   @Test
	   public void getOrderById() {
		   Orders b3 = new Orders(3,"divya",966654567,2,500);
		  
		   Mockito.when(orderrepo.findById(3)).thenReturn(Optional.of(b3));		
		   assertThat(orderservice.getOrderById(3)).isEqualTo(b3); 
	   }
	   //Testing the deleteOrderById method
	   @Test
	   public void deleteOrderById() {
		   Orders b4 = new Orders();
		   b4.setId(2);
		   b4.setCname("priya");
		   b4.setCphone(986654567);
		   b4.setBookpur(3);
		   b4.setTprice(600);
		   
		   Optional<Orders> o = Optional.of(b4);
		   Mockito.when(orderrepo.existsById(3)).thenReturn(false);
		   assertThat(orderrepo.existsById(o.get().getId()));  
	   }
	  //Testing the updateOrderById method
	   @Test
	   public void updateOrderById() {
		   Orders b5 = new Orders();
		   b5.setId(4);
		   b5.setCname("roshini");
		   b5.setCphone(986644567);
		   b5.setBookpur(1);
		   b5.setTprice(200);
		   
		   Optional<Orders> up = Optional.of(b5);
		   Orders os = up.get();
		   Mockito.when(orderrepo.findById(4)).thenReturn(up);
		   os.setBookpur(2);//updated book purchased
		   
		   Mockito.when(orderrepo.save(os)).thenReturn(os);
		   assertThat(orderservice.updateOrderById(os,4)).isEqualTo(os); 
	   }
}
