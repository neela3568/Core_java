package com.Constructors;

class Flower{
	String name;
	String color;
	Flower(){
		System.out.println("no arg constructor from flower");
	}
	Flower(String name,String color){
		System.out.println("two arg constructor from flower");
		this.name = name;
		this.color = color;
	}
	public static void main(String[] args) {
		System.out.println("main method from flower");
	}
}

public class Rose extends Flower {
	
	Rose(){
		System.out.println("no arg constructors from rose");
		this.name = "lotus";
		this.color = "black";
		
	}
	Rose(String name,String color){
		System.out.println("two arg constructor from rose");
		this.name = name;
		this.color = color; 
	}
	
	public static void main(String[] args) {
		System.out.println("main method started");
		Rose r = new Rose("jasmine","red");
		r.show();
		System.out.println("*******************");
		
		Rose r1 = new Rose();
		r1.show();
		
	}
	void show() {
		System.out.println(name);
		System.out.println(color);
	}

}
