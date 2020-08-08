 package com.javatraining;
 
 public class Order {
	 
	 private Book orderedBook;
	 private OrderStatus orderStatus;
	 
	 public Order(Book orderedBook, OrderStatus orderStatus) {
		 
		 this.orderedBook = orderedBook;
		 this.orderStatus = orderStatus;
	 }
	 
	 public OrderStatus getOrderStatus() {
		 return orderStatus;
	 }
	 
	 public void setOrderStatus(OrderStatus orderStatus) {
		 this.orderStatus = orderStatus;
	 }
	 
	 public Book getOrderedBook() {
		 return orderedBook;
	 }
 }