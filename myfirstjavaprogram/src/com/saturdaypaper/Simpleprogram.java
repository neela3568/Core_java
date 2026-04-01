package com.saturdaypaper;

import java.util.Scanner;

public class Simpleprogram {
	
	static void multiplication(int num) {
		  
		int remainder = 0;
		int sum = 0;
		int product = 1;
		while(num!=0) {
			remainder = num%10;
			sum = sum + remainder;
			product = product * remainder;
			System.out.println(product); 
			
		}
		
	}

	public static void main(String[] args) {
		System.out.println("Main method started");
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		multiplication(num);
	}

}
