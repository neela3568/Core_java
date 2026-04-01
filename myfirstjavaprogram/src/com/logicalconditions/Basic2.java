package com.logicalconditions;

import java.util.Scanner; 

//whenever we want to execute sing line not recomanded for braces
public class Basic2 {

	public static void main(String[] args) {
		System.out.println("Main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = sc.nextInt(); 

		if (age >= 18) 
			System.out.println("your eligible for voting");
			 
		 else 
			System.out.println("your not eligible for voting and Driving and Marriage");
			 

		System.out.println("Main method ended");

	}


	}


