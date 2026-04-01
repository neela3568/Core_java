package com.logicalconditions;

import java.util.Scanner;

public class Markes {

	public static void main(String[] args) {
		System.out.println("Main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your markes");
		int marks = sc.nextInt();

		if (marks > 100 || marks < 0) {
			System.out.println("Not valid markes!!!");

		}
		else if(marks >= 90) {
			System.out.println("Grade A");
		}
		else if(marks >= 75) {
			System.out.println("Grade B");

		}
		else if(marks >= 65) {
			System.out.println("Grade c");

		}
		else if(marks >= 45) {
			System.out.println("Grade D");

		}
		else {
			System.out.println("Fail");

		}

	}
}