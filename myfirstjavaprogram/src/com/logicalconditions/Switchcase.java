package com.logicalconditions;

import java.util.Scanner;

public class Switchcase {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		
		//only int,String or enum values
		switch (num) {
		case 1:
			System.out.println("thala for reason");
		
		case 2:
			System.out.println("king kohli");
			break;
		case 3:
			System.out.println("jaddu");
			break;
		case 4:
			System.out.println("kl rahul");
			break;
		case 5:
			System.out.println("rohit sarma");
		}
	}

}
 