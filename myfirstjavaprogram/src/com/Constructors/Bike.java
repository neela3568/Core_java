package com.Constructors;

public class Bike {
	String campony;
	String brand;
	String color;
	double price;
	 

	Bike(String campony, String brand, String color, double price ) {

		this.campony = campony;
		this.brand = brand;
		this.color = color;
		this.price = price;
	 }
	Bike(){
		System.out.println("no arg constructor");
	}

	public static void main(String[] args) {
		System.out.println("main method started");

		Bike b = new Bike("suzuki", "suko", "blue", 1200000.0);
		b.view();
		
		Bike b2 = new Bike("bajaj", "ns", "blue", 120000.0);
		b2.view(); 
		
		Bike b3 = new Bike();
	}

//	Return type for the method is missing
// to avoid duplicate values code
	void view() {
		System.out.println("******************");
		System.out.println("Campony Name:" +campony);
		System.out.println("Brand:"+ brand);
		System.out.println("Color:"+ color);
		System.out.println("Price:"+ price);

	}
	  

}
