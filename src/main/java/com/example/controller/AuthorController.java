package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mapper.AuthorMapper;
import com.example.model.Author;

@RestController
@RequestMapping("/rest/authors")
public class AuthorController {
	@Autowired
	AuthorMapper authorMapper;
	
	@GetMapping("/all")
	public List<Author> getAllAuthors() {
		return authorMapper.findAll();
	}
}
