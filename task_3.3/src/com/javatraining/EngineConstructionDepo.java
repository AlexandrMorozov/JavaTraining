 package com.javatraining;
 
 public class EngineConstructionDepo implements CarAssemblyLineStep {
     
	 public CarProductPart buildCarPart() {
	 
	     System.out.println("Construction of engine complete");
		 
		 return new Engine();
	 }
 }