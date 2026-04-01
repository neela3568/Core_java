package com.Constructors;

public class Pulsar extends Vehicles{
	String name;
	String color;
	Pulsar(String name,String color){
 		System.out.println("two arg constructors from pulsar");
		this.name = name;
		this.color = color;
		
	}

	public static void main(String[] args) {
		System.out.println("main method started from pulsar");
		Pulsar p = new Pulsar("Access","black");
	}
	void show() {
		System.out.println("Name :"+ name);
		System.out.println("Color :"+ color);
	}

}
class Vehicles{
	Vehicles (){
		System.out.println("two arg constructors from vehicle");
		 

	}
	
	 
}
