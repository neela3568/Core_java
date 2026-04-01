package com.Constructors;

public class Student {
	int id;
	String name;
	Student(int id,String name){
		System.out.println("two arg constructor");
		this.id = id;
		this.name = name;
	}
	Student(Student s1){
		System.out.println("two arg constructor");
		this.id = s1.id;
		this.name = s1.name;
	 
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Student s = new Student(1,"neela");
		s.show();
		
		Student s1 = new Student(2,"surya");
		s1.show();
		
	}
	void show() {
		System.out.println("*****************");
		System.out.println("Student id:"+  id);
		System.out.println("Student name:"+  name);
	}

}
