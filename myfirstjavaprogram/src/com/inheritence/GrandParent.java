package com.inheritence;

public class GrandParent {
	void familyInfo() {
		System.out.println("Surname = dara");
		System.out.println("Asserts = 100000000");

	}

}

class Parent extends GrandParent {

	 @Override
	void familyInfo() {
		System.out.println("Surname = palagala");
		System.out.println("Asserts =300000000");

	}
}

class Child extends Parent {
	public static void main(String[] args) {
		System.out.println("Main method started");

		// child object + child reference
		Child c = new Child();
		c.familyInfo();

		System.out.println("***********************");

		// parent object + parent reference
		GrandParent g = new GrandParent();
		g.familyInfo();

		System.out.println("***********************");

		// child object + parent reference
		GrandParent gk = new Child();
		gk.familyInfo();

	}
}