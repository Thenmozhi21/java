package com.exception;

//custom exception for Orders not found 
public class OrdersNotFoundException extends RuntimeException

{
	private static final long serialVersionUID = -5740323993053395302L;

	public OrdersNotFoundException(String msg) {
		super(msg);
		
	}
}
