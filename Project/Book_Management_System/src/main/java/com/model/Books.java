package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Book_details")
@Entity

//Books entity 
public class Books 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int BookId;
	
	@NotNull(message = "Book title should not be null")
	@Column(name="Book_Title", length = 30 , nullable = false , unique = true)
	private String bookTitle;
	
	@Column(name="Book_Author", length = 30 , nullable = false )
	private String bookAuthor;
	
	@Column(name="Book_Genre", length = 30 , nullable = false )
	private String bookGenre;
	
	@NotNull
	@Column(name="Book_Price", length = 30 , nullable = false )
	private int bookPrice;

	
}
