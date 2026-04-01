package com.Arrays;

//WAP to print max and min elements from an array......for and for each loop?
public class Array04MaxandMin {

	public static void main(String[] args) {
		System.out.println("Main method started");
		int[] numbers = { 75, 56, 63, 94, 45, 23 };
		int min = numbers[0];// 75
		int max = numbers[0];// 75

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < min) {
				 min =  numbers[i];
			} else if (numbers[i] > max) {
				 max =  numbers[i];
			}
		}

//
//		for (int n : numbers) {
//			if (n < min) {
//				min = n;
//			} else if (n > max) {
//				max = n;
//			}
//		}

		System.out.println("Minimum numbers from an array:" + min);
		System.out.println("Maximum numbers from an array:" + max);
	}

}
