package com.nagarro.model;


import java.io.Serializable;
import java.util.Set;

public class Author implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int id;

    private String name;

    
    private Set<Book> books;

    public Author() {
    }

    public Author(int id, String name) {
        this.id = id;
        this.name = name;
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

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }
}
