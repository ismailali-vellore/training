package com.example.service;
import java.util.ArrayList;
import java.util.List;

import com.example.entity.Book;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
public class BookService {
	private  List<Book> booksList = new ArrayList<Book>();
	private ObjectMapper mapper = new ObjectMapper();
	
	public BookService() {
		Book b1 = new Book();
		b1.setAuthor("McMillan");
		b1.setBookID(1001);
		b1.setCategory("Education");
		b1.setBookName("Mathematics");
		booksList.add(b1);
	}
	
	public String getBooks() {
		try {
			return mapper.writeValueAsString(booksList);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public String getBook(int index) throws JsonProcessingException {
		return mapper.writeValueAsString(booksList.get(index));
	}
	
	
	public void addBook(String bookName, int bookID, String bookAuthor, String bookCategory) {
		booksList.add(new Book(bookID, bookName, bookAuthor, bookCategory));
	
	}
	
	public void addBook (String bookDetail) {
		try {
			Book b1 = mapper.readValue(bookDetail, Book.class);
			booksList.add(b1);
			
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}