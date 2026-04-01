package com.Logicalprograms;

import java.util.Scanner;

public class Factors {
	 
	

	public static void main(String[] args) {
		System.out.println(" ******* Factors ********* ");
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;

		System.out.println(" Enter a number ");
		int a = sc.nextInt();
		
		for(int i = 1; i <= a/2; i++) {
			if(a % i == 0) {
				System.out.println(i + " ");
				sum = sum + i;
			}
		}
		if(sum == a) {
			System.out.println("perfect numbers");
		}else {
			System.out.println("not perfect numbers");
		}
		  

	}

}
