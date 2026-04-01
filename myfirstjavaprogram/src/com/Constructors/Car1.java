package com.Constructors;

class Vehicle {
	String type;
	 
	 
	Vehicle(String type){
		System.out.println("single parameter");
	
	}
	

}

public class Car1 extends Vehicle {
	String brand;
	
	Car1(String type,String brand){
		super(type);
		System.out.println("double constructor");
		
	}

}
class ElectricCar extends Car1{
	int batteryCapacity;
	
	ElectricCar(String type,String brand,int batteryCapacity){
		super(type,brand);
		System.out.println("three parameters");
		this.type = type;
		this.brand = brand;
		this.batteryCapacity = batteryCapacity;
 		
	}
	void show() {
		System.out.println(type);
		System.out.println(brand);
		System.out.println(batteryCapacity);
	}
	
}
class Test{
	public static void main(String[] args) {
		ElectricCar r = new ElectricCar("toyota","suko",50000);
		r.show();
	}
}
