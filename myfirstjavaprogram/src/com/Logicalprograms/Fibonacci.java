package com.Logicalprograms;

import java.util.Scanner;

public class Fibonacci {
	
	static void fibbo(int num) {
		int n1 = 0;
		int n2 = 1;
		int n3 = 0;
		
		System.out.print(n1 + " " + n2);
		for(int i = 1; i <= num-2 ; i++) {
			n3 = n1 + n2;
			System.out.print(" "+ n3);
			n1 = n2;
			n2 = n3;
			
		}
	}

	public static void main(String[] args) {
		System.out.println("Main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		fibbo(num);
		sc.close();

	}

}
