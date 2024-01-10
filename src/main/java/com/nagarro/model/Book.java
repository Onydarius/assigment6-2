package com.nagarro.model;

import java.io.Serializable;
import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;



public class Book implements Serializable{

  
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int id;
    private String name;

 
    private Author author;

    
    @JsonFormat(pattern = "MM/dd/yyyy")
    private LocalDate added;

    public Book() {
    }

    public Book(int id, String name, LocalDate added) {
        this.id = id;
        this.name = name;
        this.added = added;
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

    public LocalDate getAdded() {
        return added;
    }

    public void setAdded(LocalDate added) {
        this.added = added;
    }
}
