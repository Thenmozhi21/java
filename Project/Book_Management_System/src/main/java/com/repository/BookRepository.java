package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.model.Books;


public interface BookRepository extends JpaRepository<Books, Integer>
{
	// fetch Book by BookTitle from data base table using @query
	@Query("select b from Books b where b.bookTitle=?1")
	Books getBooksByTitle(String Title) ;
	
	// fetch Book by bookAuthor from data base table using @query
	@Query("select b from Books b where b.bookAuthor=?1")
	Books getBooksByAuthor(String Author) ;
		
	// fetch Book by bookGenre from data base table using @query
	@Query("select b from Books b where b.bookGenre=?1")
	Books getBooksByGenre(String Genre) ;
}
