package com.operator;

import java.util.Scanner;

public class Ternaryoperator {

	public static void main(String[] args) {
		System.out.println("Main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a first number");
		int a = sc.nextInt();
		
		System.out.println("Enter a second number");
		int b = sc.nextInt();
		
		System.out.println("Enter a third number");
		int c = sc.nextInt();
		
		int max = (a > b)?(a > c ? a : c) : (b > c ? b : c);
		
		System.out.println("Max number is:" + max);

	}

}
