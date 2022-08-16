package com.serviceimpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.exception.BooksNotFoundException;
import com.model.Books;
import com.repository.BookRepository;
import com.service.BookService;

@Service
public class BookServiceImpl implements BookService
{

	@Autowired
	BookRepository bookrepo;
	
	@Override
	// save Book details using book repository object
	public Books saveBooks(Books books) {
		
		return bookrepo.save(books);
	}

	@Override
	// fetch all Books details using book repository object
	public List<Books> getAllBooksDetails() {
		
		return bookrepo.findAll();
	}

	@Override
	// fetch specify Book details using book repository object
	public Books getBooksById(int id) {
		//getting Books by id, if not present throw custom exception
		return bookrepo.findById(id).orElseThrow(() -> new BooksNotFoundException("Entered Book id is not present in table"));
	}

	@Override
	// fetch specify Book details & delete it using book repository object
	public void deleteBooksById(int id) {
		//deleting Books by id, if not present throw custom exception
		bookrepo.findById(id).orElseThrow(() -> new BooksNotFoundException("Entered Book id is not present in table"));
		bookrepo.deleteById(id);
	}

	@Override
	// fetch specify Book details & update it using book repository object
	public Books updateBooksById(Books books, int id) {
		//Updating Books by id, if not present throw custom exception
		Books existingbooks= bookrepo.findById(id).orElseThrow(() -> new BooksNotFoundException("Entered Book id is not present in table"));
		
		//set new value
		existingbooks.setBookTitle(books.getBookTitle());
		existingbooks.setBookAuthor(books.getBookAuthor());
		existingbooks.setBookGenre(books.getBookGenre());
		existingbooks.setBookPrice(books.getBookPrice());
		
		bookrepo.save(existingbooks);
		return existingbooks;
		
	}

	@Override
	// fetch specify Book details with BookTitle using book repository object
	public Books getBooksByTitle(String BookTitle) {
		
		return bookrepo.getBooksByTitle(BookTitle);
	}
	
	@Override
	// fetch specify Book details with BookAuthor using book repository object
	public Books getBooksByAuthor(String BookAuthor) {
		
		return bookrepo.getBooksByAuthor(BookAuthor);
	}
	
	@Override
	// fetch specify Book details with BookGenre using book repository object
	public Books getBooksByGenre(String BookGenre) {
		
		return bookrepo.getBooksByGenre(BookGenre);
	}
	
}
