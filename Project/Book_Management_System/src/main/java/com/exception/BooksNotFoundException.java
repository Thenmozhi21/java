package com.exception;

//custom exception for Books not found 
public class BooksNotFoundException extends RuntimeException
{
	private static final long serialVersionUID = -5740323993053395302L;


	public BooksNotFoundException(String msg) {
		super(msg);
		
	}
}
