package com.exceptionhandling;

import java.util.Scanner;

public class Exh06 {

	public static void main(String[] args) {
		System.out.println("Main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number ");
		int a = sc.nextInt();
		System.out.println("enter a another number ");
		int b = sc.nextInt();

		if (b  != 0) {
			System.out.println(a / b);
		}else {
			throw new ArithmeticException("why you send zeros bro");
		}
	}

}
