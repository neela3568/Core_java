package com.logicalconditions;

import java.util.Scanner;

public class Armstrongnum {

	static boolean isAremStrong(int n) {
		boolean status = false;
		int remainder = 0;
		int sum = 0;
		int temp = n;
		
		String str = Integer.toString(n);
		int a = str.length();

		while (n != 0) {
			remainder = n % 10;
			n = n / 10;
			sum = sum+ (int) Math.pow(remainder, a);

		}
		if(sum == temp) {
			status = true;
			
		}
			

		return status;

	}

	public static void main(String[] args) {
		System.out.println("Main method stared");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		boolean armS = isAremStrong(num);
		
		if(armS) {
			System.out.println("It is a ArmStrongNumber");
		}else {
			System.out.println("It is  not a ArmStrongNumber");

		}
	}

}
