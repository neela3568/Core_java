package com.logicalconditions;

import java.util.Scanner;

public class Basic {

	public static void main(String[] args) {
		System.out.println("Main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = sc.nextInt();

		if (age >= 18) {
			System.out.println("your eligible for voting");
			System.out.println("your eligible for Driving");
			System.out.println("your eligible for Marriage");
		} else {
			System.out.println("your not eligible for voting and Driving and Marriage");
			System.out.println("Arey!! enka time undi ra");
		}

		System.out.println("Main method ended");

	}

}
