package com.example.model;

public class Category {
	private int id;
	private String name;
	private String note;
	
	public Category() {
		
	}

	public Category(String name, String note) {
		super();
		this.name = name;
		this.note = note;
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

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}	
}
