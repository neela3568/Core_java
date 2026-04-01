package com.Neela;

import java.util.Scanner;

public class work13 {
	
	static boolean spynum(int n){
		boolean status = true;
		int sum = 0;
		int remainder = 0;
		int product = 1;
		while(n!=0) {
			remainder = n%10;
			sum = sum + remainder;
			product = product*remainder;
			n = n/10;
		}
		if(sum == product) {
			status =  true;
		} else {
			status = false;
		}
		
		
		return status;
	}

	public static void main(String[] args) {
		System.out.println("Main mettthod started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  a number");
		int a = sc.nextInt();
		boolean num =  spynum(a);
		
		if(num) {
			System.out.println("it is a spy number");
		}else {
			System.out.println("it is a not spy number");

		}
	}

}
