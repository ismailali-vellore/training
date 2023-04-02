package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Book;
import com.example.service.BookService;
import com.fasterxml.jackson.core.JsonProcessingException;

@RestController
public class BookController {
	BookService bs = new BookService();
	
	@GetMapping("/booklist")
	@ResponseBody
	public String bookList() {
		return bs.getBooks();
	}
	
	@GetMapping("/book")
	@ResponseBody
	public String book(@RequestParam  int index) {
		try {
			return bs.getBook(index);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "No Book Found for given index";
	}

	@GetMapping("/book/{index}")
	@ResponseBody
	public String book(@PathVariable("index")  String index) {
		try {
			return bs.getBook(Integer.valueOf(index));
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "No Book Found for given index";
	}
	
	@PostMapping("/book")
	public String addBook(@RequestBody String book) {
		bs.addBook(book);
		return "Book Added Successfully";
	}
	
}
