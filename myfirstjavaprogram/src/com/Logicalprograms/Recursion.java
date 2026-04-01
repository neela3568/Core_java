package com.Logicalprograms;

import java.util.Scanner;

public class Recursion {
	
	static long find(int a) {
		if(a == 0 || a == 1) {
			return 1;
		}else {
			return a*find(a-1);
		}
		
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter a number");
		 int a = sc.nextInt();
		 
		long recursion = find(a);
		
		System.out.println("Recursion:" + recursion);
		 

	}

}
