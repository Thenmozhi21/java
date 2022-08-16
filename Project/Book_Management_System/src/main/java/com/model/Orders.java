package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="Orders_details")
@Entity

//Orders Entity
public class Orders {

	@Id
	@Column(name="order_id")
	private int id;
	
	@NotNull(message = "Customer name should not be null")
	@Column(name="customer_name",length = 30,nullable = false)
	private String Cname;
	
	@NotNull
	@Pattern(regexp = "[6789]{1}[0-9]{9}",message="Customer phone should not be null")
	@Column(name="customer_phone",length = 30,unique=true,nullable = false)
	private long Cphone;
	
	@NotNull
	@Column(name="book_purchased")
	private int Bookpur;
	
	@Column(name="total_price")
	private double Tprice;
	
	
}
