package com.operator;
class Animal{
	
}
class Dog extends Animal{
	
}
public class Insatnceof {

	public static void main(String[] args) {
		System.out.println("Main method started");
		Dog a = new Dog();
		Animal b = new Animal();
		Insatnceof c = new Insatnceof();
		
		System.out.println(a instanceof Animal);
		System.out.println(a instanceof Dog);
		System.out.println(a instanceof Object);
		System.out.println(b instanceof Animal);
		System.out.println(b instanceof Object);
		
	}

}
