package com.shallowcopy;

class Employee {
	int id;
	String name;
	Address address;

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;

	}
}

class Adderss {
	String city;
	String street;

	public Adderss(String city, String street) {
		this.city = city;
		this.street = street;
	}

}

public class Deepcopy {

	public static void main(String[] args) {
		System.out.println("Main metthod stareted");

	}

}
