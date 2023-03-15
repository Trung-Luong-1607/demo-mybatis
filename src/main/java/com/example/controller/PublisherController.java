package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mapper.PublisherMapper;
import com.example.model.Publisher;

@RestController
@RequestMapping("/rest/publishers")
public class PublisherController {
	@Autowired
	PublisherMapper publisherMapper;
	
	@GetMapping("/all")
	public List<Publisher> getAllPublishers() {
		return publisherMapper.findAll();
	}
}
