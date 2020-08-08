 package com.javatraining;
 
 public class CarcassConstructionDepo implements CarAssemblyLineStep {

	 public CarProductPart buildCarPart() {

	     System.out.println("Construction of carcass complete");

		 return new Carcass();
	 }
 }