package com.methods;

import java.util.Scanner;

public class Method5 {

	public static void main(String[] args) {
		System.out.println("main method started");

		Method5 m = new Method5();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number:");
		int a = sc.nextInt();

		System.out.println("Enter 2nd number:");
		int b = sc.nextInt();
		int sum = m.sum(a, b);
		System.out.println("sum:"+sum);
		
		System.out.println("Enter a number:");
		int c = sc.nextInt();
		int sub = m.subtraction(sum,c);
		System.out.println("sub:"+sub);
		
		System.out.println("Enter a number:");
		int d = sc.nextInt();
		int mul = m.mul(sum,d);
		System.out.println("mul:"+mul);
	}

	int sum(int a, int b) {
		return a + b;
	}

	int subtraction(int a, int b) {
		return a - b;
	}
	int mul(int a,int b) {
		return a*b;
	}

}
