package com.logicalconditions;

import java.util.Scanner;

public class Meals {

	public static void main(String[] args) {
		System.out.println("Welcome to our restaurant");
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose meals");
		System.out.println("1. Breakfast");
		System.out.println("2. Lunch");
		System.out.println("3. Dinner");
		
		System.out.println("Enter your items");
		int items = sc.nextInt();
		
		switch(items) {
		case 1 -> System.out.println("Breakfast");
		case 2 -> System.out.println("Lunch");
		case 3 -> System.out.println("Dinner");
		}

		System.out.println("Enter your budget");
		int budget = sc.nextInt();

		if (budget < 100) {
			System.out.println("Sorry, not enough budget for this meal");
		}
		else if (budget <= 200) {
			System.out.println("Basic meal selected");
		} else {
			System.out.println("primum meals");
		}
	}
}
