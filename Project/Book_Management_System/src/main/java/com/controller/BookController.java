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
import org.springframework.web.bind.annotation.RestController;
import com.model.Books;
import com.service.BookService;

@RestController
public class BookController
{
	@Autowired
	private BookService bookservice;
	
	// inserting book details using post mapping
	@PostMapping("/saveBooks")
	public ResponseEntity<Books> saveBooks(@Valid @RequestBody Books books){
		return new ResponseEntity<Books>(bookservice.saveBooks(books),HttpStatus.CREATED);
	}
	
	//fetching all book details details using get mapping
	@GetMapping("/getAllBooksDetails")
	public List<Books> getAllBooksDetails(){
		return bookservice.getAllBooksDetails();
	}
	
	//fetching book details by id using get mapping
	@GetMapping("/getBooksById/{id}")
	public ResponseEntity<Books> getBooksById(@PathVariable("id") int id){
		return new ResponseEntity<Books>(bookservice.getBooksById(id),HttpStatus.OK);
	}
	
	//updating book details using put mapping
	@PutMapping("/updateBooksById/{id}")
	public ResponseEntity<Books> updateBooksById(@Valid @PathVariable("id") int id, @RequestBody Books books){
		return new ResponseEntity<Books>(bookservice.updateBooksById(books, id),HttpStatus.OK);
	}
	
	//deleting book details by id using delete mapping
	@DeleteMapping("/deleteBooksById/{id}")
	public ResponseEntity<String> deleteBooksById(@PathVariable("id") int id){
		bookservice.deleteBooksById(id);
		return new ResponseEntity<String>("User details deleted successfully", HttpStatus.OK);
	}
	
	//fetching book details by book title using get mapping
	@GetMapping("/getBooksByTitle/{Title}")
	public Books getBooksByTitle(@PathVariable String BookTitle){
		return bookservice.getBooksByTitle(BookTitle);
	}
	
	
	//fetching book details by book Author using get mapping
	@GetMapping("/getBooksByAuthor/{Author}")
	public Books getBooksByAuthor(@PathVariable String BookAuthor){
	    return bookservice.getBooksByAuthor(BookAuthor);
	}
	
		
	//fetching book details by book Genre using get mapping
	@GetMapping("/getBooksByGenre/{Genre}")
	public Books getBooksByGenre(@PathVariable String BookGenre){
	    return bookservice.getBooksByGenre(BookGenre);
	}
	

}
