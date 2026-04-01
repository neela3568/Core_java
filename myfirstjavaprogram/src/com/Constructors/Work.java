package com.Constructors;

public class Work {
	String name;
	int id;
	int age;
	String gender;

	Work(String name) {
		this.name = name;
	}

	Work(String name, int id) {
		this(name);
		this.id = id;
	}

	Work(String name, int id, int age) {
		this(name, id);
		this.age = age;
	}

	Work(String name, int id, int age, String gender) {
		this(name, id, age);
		this.gender = gender;
	}

	public static void main(String[] args) {
		Work w = new Work("neela", 2, 23, "male");
		w.show();

		System.out.println("****************************");
		Work w1 = new Work("chaitu", 3, 24, "male");
		w1.show();
	}

	void show() {
		System.out.println(name);
		System.out.println(id);
		System.out.println(age);
		System.out.println(gender);
	}

}
