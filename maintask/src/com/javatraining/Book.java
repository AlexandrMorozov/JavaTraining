 package com.javatraining;
 
 public class Book {
	 
	private String bookTitle;
	private String bookAuthor;
	private String yearOfPublication;
	private String bookGenre;
	private BookStatus bookStatus;
	
	public Book(String bookTitle,String bookAuthor, String yearOfPublication, String bookGenre, BookStatus bookStatus) {
		
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
		this.yearOfPublication = yearOfPublication;
		this.bookGenre = bookGenre;
		this.bookStatus = bookStatus;
	}
	
	public String getBookTitle() {
		return bookTitle;
	}
	
	public BookStatus getBookStatus() {
		return bookStatus;
	}
	
	public void setBookStatus(BookStatus status) {
		bookStatus = status;
	}
 }