package entity;

import javax.persistence.*;

@Table(name="BOOK_DETAILS")
@Entity
public class Books 
{
@Id
private int BookId;
private String Title;
private String Author;
private String Genre;
private double Price;

public int getId() {
	return BookId;
}
public void setId(int id) {
	BookId = id;
}
public String getTitle() {
	return Title;
}
public void setTitle(String title) {
	Title = title;
}
public String getAuthor() {
	return Author;
}
public void setAuthor(String author) {
	Author = author;
}
public String getGenre() {
	return Genre;
}
public void setGenre(String genre) {
	Genre = genre;
}
public double getPrice() {
	return Price;
}
public void setPrice(double price) {
	Price = price;
}

}
