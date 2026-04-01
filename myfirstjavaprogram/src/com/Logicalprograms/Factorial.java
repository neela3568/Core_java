package com.Logicalprograms;

import java.util.Scanner;

public class Factorial {
	
	static int fact(int num) {
		int factorial = 1;
		for(int i =1; i <= num; i++) {
			factorial = factorial*i;
		 
		}
		return factorial;
	}

	public static void main(String[] args) {
		System.out.println("Main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a factorial number:");
		int num = sc.nextInt();
		
		int factorial = fact(num);
		System.out.println("factorial:"+factorial);

	}

}
