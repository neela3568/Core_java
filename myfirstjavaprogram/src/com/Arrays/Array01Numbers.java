package com.Arrays;

public class Array01Numbers {

	public static void main(String[] args) {
		System.out.println("Main method started");

		// Declaration
		int[] numbers;

		// creation
		numbers = new int[5]; // n=5 0 to 4

		// initialization
		numbers[0] = 23;
		numbers[1] = 2;
		numbers[2] = 47;
		numbers[3] = 65;
		numbers[4] = 94;

		// Representation
//		System.out.println(numbers[0]);
//		System.out.println(numbers[1]);
//		System.out.println(numbers[2]);
//		System.out.println(numbers[3]);
//		System.out.println(numbers[4]);
		
		//Representation
//		for (int i = 0; i < numbers.length; i++) {
//			System.out.println(numbers[i]);
//		}
		for(int n : numbers) {
			System.out.print(n+" ");
		}
	}
	

}
