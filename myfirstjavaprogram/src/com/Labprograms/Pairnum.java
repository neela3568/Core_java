package com.Labprograms;

public class Pairnum {

	public static void main(String[] args) {
		System.out.println("Main method started");
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int target = 10;
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr.length; j++) {
//				if (arr[i] + arr[j] == target) {
//					System.out.println(arr[i]+" "+arr[j]);
//				}
//			}
//		}
		int i = 0;
		int j = arr.length - 1;
		while (i < j) {
			if (arr[i] + arr[j] == target) {
				System.out.println(arr[i] + " " + arr[j]);
				i++;
				j--;
			} else if (arr[i] + arr[j] < target) {
				i++;
			} else {
				j--;
			}
		}

	}

}
