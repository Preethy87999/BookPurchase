package com.simplilearn.Session6.model;

public class Book {
 
	private int bookId;
	private String title;
	private String publicher;
	
	public Book() {
		
	}
	public Book(int bookId, String title, String publicher) {
		this.bookId = bookId;
		this.title = title;
		this.publicher = publicher;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPublicher() {
		return publicher;
	}
	public void setPublicher(String publicher) {
		this.publicher = publicher;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", title=" + title + ", publicher=" + publicher + "]";
	}
	
	
}
