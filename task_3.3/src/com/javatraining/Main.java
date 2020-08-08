 package com.javatraining;
 
 public class Main {
	 
	 public static void main(String[] args) {
		 
		 CarcassConstructionDepo carcassDepo = new CarcassConstructionDepo();
		 ChassisConstructionDepo chassisDepo = new ChassisConstructionDepo();
		 EngineConstructionDepo engineDepo = new EngineConstructionDepo();
		 
		 CarAssemblyLine assemblyLine = new AssemblyLine(carcassDepo, chassisDepo, engineDepo);
		 CarProduct newCar = new Car();
		 
		 assemblyLine.assembleCar(newCar);
	 }
 }