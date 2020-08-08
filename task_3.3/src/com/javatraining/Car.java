 package com.javatraining;
 
 public class Car implements CarProduct {
	 
	 private CarProductPart carcass;
	 private CarProductPart chassis;
	 private CarProductPart engine;
	 
	 public void installCarcass(CarProductPart carcass) {
		 
		 this.carcass = carcass;
		 
		 System.out.println("Carcass was installed");
	 }
	 public void installChassis(CarProductPart chassis) {
		 
		 this.chassis = chassis;
		 
		 System.out.println("Chassis were installed");
	 }
	 public void installEngine(CarProductPart engine) {
		 
		 this.engine = engine;
		 
		 System.out.println("Engine was installed");
	 }
	 
 }