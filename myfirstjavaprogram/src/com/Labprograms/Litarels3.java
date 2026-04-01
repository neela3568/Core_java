package com.Labprograms;

import java.util.Scanner;
public class Litarels3 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		 
		int last_digit = 0;
		while(num > 0){
			last_digit = num % 10000;//128%10=8
			
			if (last_digit % 2 == 0) { //8%2==0
				System.out.println(last_digit+  ": true");
			}
			else {
				System.out.println(last_digit+ ": false");
			}
			num = num / 10;//128/10 = 12
		}
		

	}

}
