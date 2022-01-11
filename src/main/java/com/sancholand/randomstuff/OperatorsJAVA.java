package com.sancholand.randomstuff;

public class OperatorsJAVA {

	public static void main(String[] args) {
		
		int remainder = 10 % 4;
		System.out.println(remainder);
		
		int n = 2;
		n +=2;
		System.out.println(n);
		
		
		
		boolean isCar = false;
		
	
		
		boolean wasCar = isCar ? true : false;
		
		System.out.println(wasCar);
		
		// test from class
		
		double a = 20d;
		double b = 80;
		double c = (a + b) * 25;
		
		double Theremainder = c % 40;
		System.out.println(Theremainder);
		if(Theremainder <= 20) {
			System.out.println("Total was over the limit.");
		}
	}
	
	
	
}
