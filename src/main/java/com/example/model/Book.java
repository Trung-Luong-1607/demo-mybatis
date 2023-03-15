package com.example.model;

import java.util.Date;

public class Book {
	private int id;
	private String name;
	private Author author;
	private Category category;
	private Publisher publisher;
	private Date publishDate;
	
	public Book() {
		
	}

	public Book(int id, String name, Author author, Category category, Publisher publisher, Date publishDate) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.category = category;
		this.publisher = publisher;
		this.publishDate = publishDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Publisher getPublisher() {
		return publisher;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}

	public Date getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}
}
