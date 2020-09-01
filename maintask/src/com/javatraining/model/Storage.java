 package com.javatraining.model;

 import com.javatraining.status_model.BookStatus;

 public class Storage {
	 
	 private Book[] listOfBooks;
	 
	 public Storage(Book[] listOfBooks) {
		 this.listOfBooks = listOfBooks;
	 }
	 
	 public void removeBook(int bookNum) {
		 listOfBooks[bookNum].setBookStatus(BookStatus.UNAVAILABLE);

		 System.out.println("Book " + listOfBooks[bookNum].getBookTitle() + " was removed"); //
	 }
	 
	 public Book addBook(int bookNum) {
		 
		 listOfBooks[bookNum].setBookStatus(BookStatus.IN_STOCK);
		 
		  System.out.println("Book " + listOfBooks[bookNum].getBookTitle() + " was added"); //
		 
		 return listOfBooks[bookNum];
		 
	 }
	 
	 public Book getBook(int bookNum) {
		 return listOfBooks[bookNum];
	 }

 }