package com.inheritence;

class parent {
	int a = 10;
	int b = 49;

	void display() {
		System.out.println("parent");
	}
}

class child01 extends parent {
	int a = 38;
	int b = 43;

	void display() {
		System.out.println("child01");
	}
}

class child02 extends child01 {
	int a = 38;
	int b = 39;

	void display() {
		System.out.println("child02");
	}
}

public class Inh01 {

	public static void main(String[] args) {
		System.out.println("Main method started");
		Inh01 i = new Inh01();
		child01 c = new child02();
		c.display();
		System.out.println(c.a); 
		System.out.println(c.a); 
	}

}
