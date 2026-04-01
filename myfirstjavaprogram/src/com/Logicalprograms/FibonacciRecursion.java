package com.Logicalprograms;

import java.util.Scanner;

public class FibonacciRecursion {
	
	static int fibbo(int n) {
		if(n == 0 || n == 1) {
			return 1;
		}else {
			return fibbo(n-1) + fibbo(n-2);
		}
	}

	public static void main(String[] args) {
		System.out.println("Main method started");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) {
			System.out.println(fibbo(i));
		}
	}

}
