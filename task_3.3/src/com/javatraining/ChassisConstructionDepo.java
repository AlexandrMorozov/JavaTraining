 package com.javatraining;
 
 public class ChassisConstructionDepo implements CarAssemblyLineStep {
     
	 public CarProductPart buildCarPart() {
	 
	     System.out.println("Construction of chassis complete");
		 
		 return new Chassis();
	 }
 }