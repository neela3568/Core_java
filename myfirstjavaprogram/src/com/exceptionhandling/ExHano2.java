package com.exceptionhandling;

class Vehicle {

}

class Bike extends Vehicle {

}

public class ExHano2 {

	public static void main(String[] args) {
		System.out.println("Main method stated");
		try {
			System.out.println("in try");
			Bike b = (Bike) new Vehicle();
			System.out.println("bike");

		}catch(Exception e) {
			e.printStackTrace();
		}
		 
	}

}
