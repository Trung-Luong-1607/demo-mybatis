package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mapper.CategoryMapper;
import com.example.model.Category;

@RestController
@RequestMapping("/rest/categories")
public class CategoryController {
	@Autowired
	CategoryMapper categoryMapper;
	
	@GetMapping("/all")
	public List<Category> getAllCategories() {
		return categoryMapper.findAll();
	}
}
