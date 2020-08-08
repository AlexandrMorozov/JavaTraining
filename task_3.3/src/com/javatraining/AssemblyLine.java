 package com.javatraining;
 
 public class AssemblyLine implements CarAssemblyLine {
     
	 private CarAssemblyLineStep CarcassConstructionDepo;
	 private CarAssemblyLineStep ChassisConstructionDepo;
	 private CarAssemblyLineStep EngineConstructionDepo;
	 
	 public AssemblyLine(CarcassConstructionDepo carcassConstr, ChassisConstructionDepo chassisConstr, EngineConstructionDepo engineConstr) {
		 
		 CarcassConstructionDepo = carcassConstr;
		 ChassisConstructionDepo = chassisConstr;
		 EngineConstructionDepo = engineConstr;
	 }
	 
	 public CarProduct assembleCar(CarProduct car) {
	     
		 car.installCarcass(CarcassConstructionDepo.buildCarPart());
		 car.installChassis(ChassisConstructionDepo.buildCarPart());
		 car.installEngine(EngineConstructionDepo.buildCarPart());
		 
		 System.out.println("Car construction completed");
		 
		 return car;
	 }
 }