 package com.javatraining;

 import com.javatraining.model.Book;
 import com.javatraining.model.BookShop;
 import com.javatraining.model.Storage;
 import com.javatraining.status_model.BookStatus;

 public class Main {
	 
	 public static void main(String[] args) {
		 
		 Book[] books = {
		 new Book("aaa", "aaa", "1924", "aaa", BookStatus.IN_STOCK),
		 new Book("bbb", "bbb", "1923", "bbb", BookStatus.IN_STOCK),
		 new Book("ccc", "ccc", "1930", "ccc", BookStatus.UNAVAILABLE)
		 };
		 
		 Storage storage = new Storage(books);
		 BookShop bookShop = new BookShop();
		 
		 storage.removeBook(0);
		 
		 bookShop.createRequest(storage.getBook(1));
		 bookShop.createRequest(storage.getBook(0));
		 
		 storage.addBook(0);
		 bookShop.completeRequests(storage.getBook(0));
		 
		 bookShop.createOrder(storage.getBook(1));
		 bookShop.completeOrder(0);
		 
		 bookShop.createOrder(storage.getBook(2));
		 bookShop.completeOrder(1);
		 bookShop.cancelOrder(1);
		 
		 
	 }
	 
 }