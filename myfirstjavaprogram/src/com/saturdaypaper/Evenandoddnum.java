package com.saturdaypaper;

import java.util.Scanner;

public class Evenandoddnum {

	public static void main(String[] args) {
		System.out.println("Main mehod started");
		Scanner sc = new Scanner(System.in);

		System.out.println("Starting number");
		int a = sc.nextInt();

		System.out.println("Ending number");
		int b = sc.nextInt();
		
		System.out.println("EVEN NUMBERS");
		display(a, b);
		
		System.out.println();
		System.out.println("ODD NUMBERS");
 		display1(a, b);

	}

	static void display(int num, int value) {
		for (int i = num; i <= value; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
	}
	  
	static void display1(int num, int value) {
		for (int i = num; i <= value; i++) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
		}
	}
}