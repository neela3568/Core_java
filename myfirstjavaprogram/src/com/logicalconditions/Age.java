package com.logicalconditions;

import java.util.Scanner;

public class Age {

	public static void main(String[] args) {
		System.out.println("amin method started");
		System.out.println(".........Ade details info...........");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age"); 
		int age = sc.nextInt();
		
		if(age >= 5 && age <=0) {
			System.out.println("you are kid");
		}
		if(age >= 12 && age <= 6) {
			System.out.println("you are children");
		}
		if(age >= 13 && age <= 19) {
			System.out.println("you are teenage");
		}
		if(age >= 20 && age <= 35) {
			System.out.println("your are youngh");
		}
		if(age >= 60) {
			System.out.println("old age");
		}
		 
	}

}
