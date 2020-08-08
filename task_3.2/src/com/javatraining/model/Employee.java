 package com.javatraining.model;
 
 public abstract class Employee {
     
	 protected String name;
	 protected int salary;
	 protected String duties;
	 
	 public Employee(String name, int salary, String duties) {
	     this.name = name;
		 this.salary = salary;
		 this.duties = duties;
	 }
	 
	 public String getName() {
	     return name;
	 }
	 
	 public int getSalary() {
	     return salary;
	 }
	 
	 public String getDuties() {
	     return duties;
	 }
	 
 }