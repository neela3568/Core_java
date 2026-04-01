package com.saturdaypaper;

import java.util.Scanner;

public class Mobilerec {

	public static void main(String[] args) {
		System.out.println("Main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your mobile number for recharge");
		long mobilenum = sc.nextLong();
		System.out.println("************Recharge plans details*************");
		System.out.println("1.$199 - 1.5GB/day for 28 days");
		System.out.println("2.$399 - 2GB/day for 56 days");
		System.out.println("3.$599 - 3GB/day for 84 days");
		System.out.println("4.$999 - Unlimited GB/day for 84 days");
		System.out.println("5.Back to Home");

		System.out.println("Enter your plan");
		int recharge = sc.nextInt();

		switch (recharge) {
		case 1 -> {
			String plan = "$199 - 1.5GB/day for 28 days";
			System.out.println(plan);
		}
		case 2 -> {
			String plan = "$399 - 2GB/day for 56 days";
			System.out.println(plan);
		}
		case 3 -> {
			String plan = "$599 - 3GB/day for 84 days";
			System.out.println(plan);
		}
		case 4 -> {
			String plan = "$999 - Unlimited GB/day for 84 days";
			System.out.println(plan);
		}
		default -> System.out.println("no recharge plan");
		}
		 
	}
}
