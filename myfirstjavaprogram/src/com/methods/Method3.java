package com.methods;

import java.util.Scanner;

public class Method3 {
	int a, b, result;
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("main method started");

		Method3 m = new Method3();
		m.add();

	}

	void add() {
		System.out.println("addition");
		System.out.print("Enter a number : ");
		a = sc.nextInt();
		System.out.print("Enter a number : "); 
		b = sc.nextInt();
		result = a+b;
		System.out.println(result);
		sub();

	}

	void sub() {
		System.out.println("Subtraction");
		System.out.print("Enter a number : ");
		int a = sc.nextInt();
		result = result - a;
		System.out.println(result);
		mul();

	}

	void mul() {
		System.out.println("Multipulication");
		System.out.print("Enter a number : ");
		int a = sc.nextInt();
		result = result * a;
		System.out.println(result);
		div();
	}

	void div() {
		System.out.println("Divition");
		System.out.print("Enter a number : ");
		int a = sc.nextInt();
		System.out.println((float)result/(float)a);
		

	}
}
