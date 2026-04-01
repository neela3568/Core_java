package com.operator;

class Operator {
	int a;
	int b;

	Operator() {
		System.out.println("no arg constructor from operator");
	}
 
}

public class Assignment extends Operator {

	Assignment() {
		System.out.println("no arg constructor from assignment");
	}
	

	Assignment(int a,int b) {
		System.out.println("parameterized constructor");
		this.a = a;
		this.b = b;
	}

	public static void main(String[] args) {
		System.out.println("Main method started");
		Assignment a = new Assignment();
		a.show();
		
		Assignment a1 = new Assignment(10,20);
		a1.show();
		
		
	}

	void show() {
		System.out.println(a * b);
	}
}
