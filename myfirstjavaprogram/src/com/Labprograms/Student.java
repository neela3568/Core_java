package com.Labprograms;

public class Student {
	String name;
	int age = 18;
	 
	Student(){
		System.out.println("no arg constructor");
		 name = "stephen";
		 age = 64;
	}
	 

	public static void main(String[] args) {
		System.out.println("main method started");
		Student s = new Student();
		s.display();
	}
	void display() {
		System.out.println("Name :"+name);
		System.out.println("Age :"+ age);
	}

}
