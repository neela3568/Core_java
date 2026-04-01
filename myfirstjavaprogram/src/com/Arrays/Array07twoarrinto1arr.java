package com.Arrays;

public class Array07twoarrinto1arr {

	public static void main(String[] args) {
		System.out.println("Main method started");

		int arr1[] = { 10, 20, 30 };
		int a1Len = arr1.length;

		int arr2[] = { 40, 50, 60 };
		int a2Len = arr2.length;

		int arr3[] = new int[a1Len + a2Len];

		for (int i = 0; i < a1Len; i++) {
			 arr3[i] = arr1[i];
		}
		for(int i = 0; i < a2Len; i++) {
			arr3[a1Len + i] = arr2[i];
		}
		for(int a : arr3) {
			System.out.println(a);
			
		}
	}

}
