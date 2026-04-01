package com.inheritence;

class vehicle {
	String engine;
	int petrolCapacity;

}

public class Bike extends vehicle {
	String name;
	String color;
	int speed;

	public static void main(String[] args) {
		Bike b = new Bike();
		System.out.println(b.engine);
		System.out.println(b.petrolCapacity);
		System.out.println(b.name);
		System.out.println(b.color);
		System.out.println(b.speed);
	}

}
