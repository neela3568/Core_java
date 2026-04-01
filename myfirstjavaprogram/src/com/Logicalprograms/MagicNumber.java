package com.Logicalprograms;

import java.util.Scanner;

public class MagicNumber {
	static int magicNum(int n) {
		 
		int r = 0;
		int sum;
		while (n > 9) {
			 sum = 0;
			while (n != 0) {
				r = n % 10;
				sum = sum + r;
				n = n / 10;

			}
			n = sum;
			
		}
		 

		return n;
	}

	public static void main(String[] args) {
		System.out.println(" ***********Magic number************");
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter a magic number:");
		int n = Sc.nextInt();
		int sum = magicNum(n);
		
		 if(sum == 1) {
			 System.out.println(sum);
			 System.out.println("it is a magic number");
		 }else {
			 System.out.println(sum);
			 System.out.println("it is not a magic number");

		 }
	}
}