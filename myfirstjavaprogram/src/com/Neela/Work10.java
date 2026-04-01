package com.Neela;

import java.util.Scanner;

public class Work10 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("main method started");
		System.out.println("enter a number1");
		int q = sc.nextInt();
		System.out.println("enter a number2");
		double w = sc.nextDouble();

		System.out.println("enter a number3");
		float e = sc.nextFloat();
		addition(q,w,e);
		sc.close();
	}

	static void addition(int a, double b, float c) {

		System.out.println(a + b + c);
	}
}
