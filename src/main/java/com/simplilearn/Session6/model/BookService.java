package com.simplilearn.Session6.model;

import java.util.ArrayList;
import java.util.List;

public class BookService {

	List<Book> books = new ArrayList<Book>();
	public void addBook(Book book) {
	System.out.println("Book" +book.getTitle()+"added..");
	}
	
	public List<Book> getBooks(){
		return books;
	}
	
	public Book getBookById(int id) {
		Book foundBook = null;
		for(Book book : books) {
			if(book.getBookId()==id) {
				foundBook = book;
				break;
			}
		}
		return foundBook;
	}
	
}
