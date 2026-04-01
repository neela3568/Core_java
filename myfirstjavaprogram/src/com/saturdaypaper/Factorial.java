package com.saturdaypaper;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		System.out.println("factorial");
		Scanner sc = new Scanner(System.in);

		System.out.println("enter a number");
		int a = sc.nextInt();
		int product = 1;
		for (int i = a; i > 0; i--) {
 			product = product * i;
		}
		System.out.println(product);

	}

}
