package com.logicalconditions;

import java.util.Scanner;

public class Maxnum {

	public static void main(String[] args) {
		System.out.println("Main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a first number");
		int a = sc.nextInt();

		System.out.println("Enter a second number");
		int b = sc.nextInt();

		if (a > b) {
			System.out.println("Max number :" + a);

		}else {
			System.out.println("Max number :" + b);
		}
	}
}
