 package com.javatraining.main;
 
 import com.javatraining.model.*;
 
 public class Main {
     
	 public static void main(String[] args) {
	     
		 Employee[] arrayOfEmployees = new Employee[5];
		 int totalMonthlySalarySpending = 0;
		 
		 arrayOfEmployees[0] = new ProjectManager("Alexei", 1300, "bla-bla");
		 arrayOfEmployees[1] = new Tester("Yuri", 500, "bla-bla");
		 arrayOfEmployees[2] = new Tester("Dmitri", 500, "bla-bla");
		 arrayOfEmployees[3] = new Coder("Nikolai", 800, "bla-bla");
		 arrayOfEmployees[4] = new Coder("Sasha", 800, "bla-bla");
		 
		 for (int i = 0; i < arrayOfEmployees.length; i++) {
		     
		     System.out.println(arrayOfEmployees[i].getName() + "'s salary:" + arrayOfEmployees[i].getSalary());
		 
		     totalMonthlySalarySpending = totalMonthlySalarySpending + arrayOfEmployees[i].getSalary();
		 }
		 
		 System.out.println("Total monthly salary: " + totalMonthlySalarySpending);
		 
	 }
	 
 }