package com.Arrays;

public class Array13BubbleSort {

	public static void main(String[] args) {
		System.out.println("Main method started");
		int[] arr = { 50, 40, 30, 20, 5, 10 };
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				boolean status = false;
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					status = true;
				}

			}
		}
		for(int a : arr) {
			System.out.print(a+" ");
		}
	}

}
