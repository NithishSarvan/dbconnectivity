package com.nithi.jsphibernateh2.course;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course {

	@Id // -> primary KEY
	private long id;
	
	//@Column(name = "name")
	private String name;
	
	//@Column(name = "name") -> not need bcz , row name are eqauls with db row
	private String author;

	public Course() {
		
	}

	public Course(long id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String course) {
		this.author = course;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", course=" + author + "]";
	}

}
