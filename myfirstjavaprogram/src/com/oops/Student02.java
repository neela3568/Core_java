package com.oops;

public class Student02 {
	private String name;
	private int age;
	private int markes;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		if (age > 0)
			this.age = age;
		else
			System.out.println("INVALID Age");
	}

	public int getAge() {
		return age;
	}

	public void setMarkes(int markes) {
		if (markes >= 0 && markes <= 100)
			this.markes = markes;
		else
			System.out.println("INVALID MARKES");
	}

	public int getMarkes() {
		return markes;
	}

}
