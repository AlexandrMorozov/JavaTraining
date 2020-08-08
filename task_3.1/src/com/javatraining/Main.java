 package com.javatraining;
 
 import java.util.Random;
 
 class Main {
     public static void main(String[] args) {
	     
		 int[] randomNumbers = new int[3];
		 
		 for (int i = 0; i < randomNumbers.length; i++) {
		     
			 randomNumbers[i] = generateNumber();
			 
			 System.out.println(i + "number: " + randomNumbers[i]);
		 }
		 
		 int finalNum = concatNumbers(randomNumbers[0], randomNumbers[1]);
		 
		 System.out.println(calculateDifference(finalNum, randomNumbers[2]));
		 
	 }
	 
	 public static int generateNumber() {
	     
		 Random newRandom = new Random();
		
		 return newRandom.nextInt(999);
	 }
	 
	 public static int concatNumbers(int firstNum, int secNum) {
	     
		 String finalNum = "";
		 
		 finalNum = finalNum + firstNum + secNum;
		 
		 return Integer.valueOf(finalNum);
	 }
	 
	 public static int calculateDifference(int firstNum, int secNum) {
	     return firstNum - secNum;
	 }
 }