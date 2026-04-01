package com.Logicalprograms;

import java.util.Scanner;

public class Happynum {
	
	static boolean happyNum(int num) {
		int sum = 0;
		int remainder = 0;
		while(num!=0) {
			remainder = num % 10;
			sum = sum + (remainder^2);
			num = num/10;
			 
		}
		if(sum == 1) {
			return true;
		}else {
			return happyNum(num);
		}
	}

	public static void main(String[] args) {
		System.out.println("Main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		boolean n = happyNum(num);
		
		System.out.println("Happy Number:"+n);
	}

}
