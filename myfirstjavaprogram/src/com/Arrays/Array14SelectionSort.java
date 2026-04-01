package com.Arrays;

public class Array14SelectionSort {

	public static void main(String[] args) {
		System.out.println("Main method started");
		int[] arr = { 9, 4, 5, 6, 2, 4, 5 };
		int len = arr.length;
		int temp = 0;
		for (int i = 0; i < len; i++) {
			int min = i;
			for (int j = i + 1; j < len; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
		for(int a : arr) {
			System.out.print(a+" ");
		}
	}

}
