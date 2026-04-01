package com.abstractprograms;

public class Interface01 {

	public static void main(String[] args) {
		System.out.println("Main method started");

		System.out.println("*******Cat related information*********");
		// child object and parent interface and parent reference
		Animal c = new Cat();
		c.sound();
		c.eat();
		c.walk();
		c.sleep();
		Animal.run();

		System.out.println("*******Dog related information*********");
		// child object and parent interface and parent reference
		Animal d = new Dog();
		d.sound();
		d.eat();
		d.walk();
		d.sleep();

	}

}
