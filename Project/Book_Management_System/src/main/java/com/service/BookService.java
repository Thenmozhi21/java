package com.service;

import java.util.List;

import com.model.Books;

public interface BookService
{
	Books saveBooks(Books books); //save book details
	
    List<Books> getAllBooksDetails(); //fetching all book details 
	
	Books getBooksById(int id); //fetching Books details based on id
	
	void deleteBooksById(int id); //delete Books details based on id
	
	Books updateBooksById(Books books, int id); //change Books details based on id
	
	Books getBooksByTitle(String BookTitle); //fetching books details based on Title
	
	Books getBooksByAuthor(String BookAuthor); //fetching books details based on Author
	
	Books getBooksByGenre(String BookGenre); //fetching books details based on Genre
		
}
