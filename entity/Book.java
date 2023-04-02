package com.example.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Book {
	private String bookName = "";
	private int bookID;
	private String author="";
	private String category="";
	
	public Book(int id, String name, String authorName, String categoryName ) {
		this.bookID = id;
		this.bookName = name;
		this.author = authorName;
		this.category = categoryName;
	}
	public Book() {
		
	}

}
