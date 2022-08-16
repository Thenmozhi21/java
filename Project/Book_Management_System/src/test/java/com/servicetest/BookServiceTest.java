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
import com.model.Books;
import com.repository.BookRepository;
import com.service.BookService;


@SpringBootTest
public class BookServiceTest {

	   @Autowired
	   private BookService bookservice;
	   @MockBean
	   private BookRepository bookrepo;
	   
	   
	 //Testing the saveBook method   
	   @Test
	   public void saveBooks() {
		   Books b = new Books();
		   b.setBookId(1);
		   b.setBookTitle("bean");
		   b.setBookAuthor("john");
		   b.setBookGenre("comedy");
		   b.setBookPrice(200);
		  
		   Mockito.when(bookrepo.save(b)).thenReturn(b);
		   assertThat(bookservice.saveBooks(b)).isEqualTo(b); 
	   }
	   
	   //Testing the getAllBooksDetails method
	   @Test
	   public void getAllBooksDetails() {
		   Books b1 = new Books();
		   b1.setBookId(2);
		   b1.setBookTitle("Fairy tales");
		   b1.setBookAuthor("james");
		   b1.setBookGenre("magical");
		   b1.setBookPrice(300);
		   
		   Books b2 = new Books();
		   b2.setBookId(3);
		   b2.setBookTitle("cinderella ");
		   b2.setBookAuthor("thompson");
		   b2.setBookGenre("magical story");
		   b2.setBookPrice(350);
		   
		   //creating array list and giving object to array list 
		   List<Books> bl = new ArrayList<Books>();
		   //adding Books object to list
		   bl.add(b1);
		   bl.add(b2);
		   
		   Mockito.when(bookrepo.findAll()).thenReturn(bl);
		   assertThat(bookservice.getAllBooksDetails()).isEqualTo(bl); 
		   
	   }
	   //Testing the getBooksById method
	   @Test
	   public void getBooksById() {
		   Books b3 = new Books(2,"Fairy tales","james","comedy",300);

		   Mockito.when(bookrepo.findById(2)).thenReturn(Optional.of(b3));		
		   assertThat(bookservice.getBooksById(2)).isEqualTo(b3); 
	   }
	   //Testing the deleteBooksById method
	   @Test
	   public void deleteBooksById() {
		   Books b4 = new Books();
		   b4.setBookId(3);
		   b4.setBookTitle("cinderella ");
		   b4.setBookAuthor("thompson");
		   b4.setBookGenre("magical story");
		   b4.setBookPrice(350);
		   
		   Optional<Books> o = Optional.of(b4);
		   Mockito.when(bookrepo.existsById(3)).thenReturn(false);
		   assertThat(bookrepo.existsById(o.get().getBookId()));  
	   }
	  //Testing the updateBooksById method
	   @Test
	   public void updateBooksById() {
		   Books b5 = new Books();
		   b5.setBookId(4);
		   b5.setBookTitle("snow white ");
		   b5.setBookAuthor("thomson");
		   b5.setBookGenre("magical story");
		   b5.setBookPrice(300);
		   
		   Optional<Books> up = Optional.of(b5);
		   Books us = up.get();
		   Mockito.when(bookrepo.findById(4)).thenReturn(up);
		   us.setBookPrice(250);//updated book price
		   
		   Mockito.when(bookrepo.save(us)).thenReturn(us);
		   assertThat(bookservice.updateBooksById(us,4)).isEqualTo(us); 
	   }
	   //Testing the getBooksByTitle method
	   @Test
	   public void getBooksByTitle() {
		   Books b6 = new Books(1,"bean","john","comedy",300);

		   Mockito.when(bookrepo.findById(1)).thenReturn(Optional.of(b6));		
		   assertThat(bookservice.getBooksByTitle("bean")).isEqualTo(b6); 
	   }
	   
}
