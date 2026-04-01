package com.operator;

import java.util.Scanner;

public class Arithmatic {

	public static void main(String[] args) {
		System.out.println("Main methos started");
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number:");
		int x = sc.nextInt();
		
		System.out.print("Enter a number:");
		int y = sc.nextInt(); 
		
//		BODMAS
		System.out.println("Addition:"+ (x + y));
		System.out.println("Subtraction:"+ (x - y));
		System.out.println("Multiplication:"+ x*y);
		System.out.println("Division:"+ x/y);
		System.out.println("Modulus:"+ x%y);
		
	}

}
