package com.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.model.ErrorMessage;

@ControllerAdvice
@ResponseStatus
//global handler class for BooksNotFoundException,OrdersNotFoundException  
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler
{
	@ExceptionHandler(BooksNotFoundException.class)
	public ResponseEntity<ErrorMessage> handleBooksNotFoundException(BooksNotFoundException ex, WebRequest request){
			ErrorMessage errorMessage = new ErrorMessage(HttpStatus.NOT_FOUND, ex.getMessage());
			return  ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorMessage);
		}
	@ExceptionHandler(OrdersNotFoundException.class)
	public ResponseEntity<ErrorMessage> handleOrdersNotFoundException(OrdersNotFoundException ex, WebRequest request){
			ErrorMessage errorMessage = new ErrorMessage(HttpStatus.NOT_FOUND, ex.getMessage());
			return  ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorMessage);
		}
}
