package com.test.demo.controller;

import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.demo.bean.Book;

@RestController
public class BookController {
    
	
	@RequestMapping("/books")
	public List<Book> getBook() {
		return Arrays.asList(new Book(12, "Java Topic", "Java Discreption"),
				new Book(55, "Spring Boot", "Spring Bot Discreption"), new Book(12, "JPA Topic", "JPA Discreption"));
	}
}
