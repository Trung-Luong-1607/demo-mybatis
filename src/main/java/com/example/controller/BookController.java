package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mapper.BookMapper;
import com.example.model.Book;

@RestController
@RequestMapping("/rest/books")
public class BookController {
	@Autowired
	BookMapper bookMapper;
	
	@GetMapping("/all")
	public List<Book> getAllBooks() {
		return bookMapper.findAll();
	}
}
