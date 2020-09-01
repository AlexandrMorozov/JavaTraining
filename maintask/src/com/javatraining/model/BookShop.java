 package com.javatraining.model;

 import com.javatraining.status_model.BookStatus;
 import com.javatraining.status_model.OrderStatus;

 public class BookShop {
	 
	 private Order[] listOfOrders = new Order[100];
	 private Order[] listOfRequests = new Order[100];
	 private int orderCounter = 0;
	 private int requestCounter = 0;
	 
	 public void createOrder(Book book) {
		 
		 Order newOrder = new Order(book, OrderStatus.NEW);
		 
		 listOfOrders[orderCounter] = newOrder;
		 orderCounter++;
		 
		 System.out.println("Order on the book "+ book.getBookTitle() + " was created"); //
		 
		 createRequest(book);
		 
		 
	 }
	 
	 public void createRequest(Book book) {
		 
		 if (book.getBookStatus() == BookStatus.UNAVAILABLE) {
			 
			 /*Request*/Order newRequest = new /*Request*/Order(book, OrderStatus.NEW);
			 requestCounter++;
			 
			 listOfRequests[requestCounter] = newRequest;
			 
			 System.out.println("Request on the book "+ book.getBookTitle() + " was created"); //
		 }
		 else {
			 System.out.println("Request on the book "+ book.getBookTitle() + " cannot be created!"); //
		 }
	 }
	 
	 public void completeOrder(int numOfOrder) {
		 
		 if (listOfOrders[numOfOrder].getOrderedBook().getBookStatus() == BookStatus.IN_STOCK) {
			 
			 listOfOrders[numOfOrder].setOrderStatus(OrderStatus.COMPLETED);
			 
			 System.out.println("Order " + numOfOrder + " : "+ listOfOrders[numOfOrder].getOrderedBook().getBookTitle() + " was completed"); //
		 }
		 else {
			 System.out.println("Order " + numOfOrder + " : "+ listOfOrders[numOfOrder].getOrderedBook().getBookTitle() + " cannot be completed!"); //
		 }
		 
	 }
	 
	 public void completeRequests(Book requestedBook) {
		 
		 for (int i = 0; i < listOfRequests.length; i++) {
			 
			 if (listOfRequests[i]!=null && listOfRequests[i].getOrderedBook() == requestedBook) {
				 
				 listOfRequests[i].setOrderStatus(OrderStatus.COMPLETED);
				 
				 System.out.println("Request on the book "+ requestedBook.getBookTitle() + " was completed!"); //
			 }
		 }
	 }
	 
	 public void cancelOrder(int numOfOrder) {
		 listOfOrders[numOfOrder].setOrderStatus(OrderStatus.CANCELED);
		 
		  System.out.println("Order " + numOfOrder + " : "+ listOfOrders[numOfOrder].getOrderedBook().getBookTitle() + " was canceled"); //
	 }
	 
 }