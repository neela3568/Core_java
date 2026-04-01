package com.Logicalprograms;

import java.util.Scanner;

public class Reversenumbers {

	static boolean reverse(int n) {
		boolean status = false;
		int temp = n;
		int remainder = 0;
		int reverse = 0;
		while (n != 0) {
			remainder = n % 10;
			n = n / 10;//12 1 0
			reverse = (reverse * 10) + remainder;
		}
		
		if(reverse == temp) {
			status = true;
		}
		return status;
	}
	
	 

	public static void main(String[] args) {
		System.out.println("************Reverse Numbers****************8");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		boolean revnum = reverse(num);
		
		if(revnum) {
			System.out.println("it is a palindrom");
		}else {
			System.out.println("it is not a palindrom");
		}
	}

}
