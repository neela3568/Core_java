package com.Arrays;

import java.util.Scanner;

public class Array05Primenum {

	public static void main(String[] args) {
		System.out.println("Main method started");
		Scanner sc = new Scanner(System.in);

		// Reading the array size from console
		System.out.println("Enter a Array Size");
		int size = sc.nextInt();

		int[] arr = new int[size];

		// Reading the elements from console
		System.out.println("Reading the elements from console");
		for (int i = 0; i < size; i++) {
			arr[i]= sc.nextInt();
		}
		
		
		//Representing the array elements
		System.out.println("Reprensenting the array elements");
		for (int a : arr) {
			boolean primeCheck = true;
			
			if(a<=1) {
				primeCheck = false;
			}
			for (int i = 2; i < a; i++) {
				if (a % i == 0) {
					primeCheck = false;
					break;

				}

			}
			if (primeCheck) {
				System.out.print(a+" ");
			}
		}

	}
}
