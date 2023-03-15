package com.example.model;

public class Author {
	private int id;
	private String name;
	private String website;
	private String note;
	
	public Author() {
		
	}

	public Author(int id, String name, String website, String note) {
		super();
		this.id = id;
		this.name = name;
		this.website = website;
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

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
}
