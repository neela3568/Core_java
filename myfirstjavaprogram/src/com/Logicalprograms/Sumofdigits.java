package com.Logicalprograms;

import java.util.Scanner;

public class Sumofdigits {
	
	static int sumOfDigits(int n){
		int sum = 1;
		int remainder = 0;
 		
		for(int i=0; i<n; i++) {
			remainder = n%10;
			n = n/10;
			sum = sum + remainder;
		}
		 
		return sum;
		
	}

	public static void main(String[] args) {
		System.out.println("Main method started");
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = sumOfDigits(num);
		
		System.out.println("Sum Of Digits :" + sum);
	}

}
