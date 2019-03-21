package com.test.demo.bean;

public class Book {
	private int id;
	private String name;
	private String discreption;

	public Book(int id, String name, String discreption) {
		super();
		this.id = id;
		this.name = name;
		this.discreption = discreption;
	}

	public Book() {
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

	public String getDiscreption() {
		return discreption;
	}

	public void setDiscreption(String discreption) {
		this.discreption = discreption;
	}

}
