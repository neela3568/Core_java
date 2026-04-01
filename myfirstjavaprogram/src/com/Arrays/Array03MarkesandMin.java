package com.Arrays;

//WAP to print sum of the all markes and avg of the all markes? 
public class Array03MarkesandMin {

	public static void main(String[] args) {
		System.out.println("Main method started");
		int[] markes = { 84, 56, 75, 68, 69 };
		int sum = 0;
		int avg = 0;

		for (int i = 0; i < markes.length; i++) {
			sum = sum + markes[i];
		}
		avg = sum / markes.length;
		System.out.println("Sum of the all markes :" + sum);
		System.out.println("Sum of the all average :" + avg);
	}

}
