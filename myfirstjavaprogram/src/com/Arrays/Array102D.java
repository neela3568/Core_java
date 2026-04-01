package com.Arrays;

import java.util.Scanner;

public class Array102D {

	public static void main(String[] args) {
		System.out.println("Main method started");
		Scanner sc = new Scanner(System.in);

		int[][] arr = new int[3][3];

		System.out.println("Enter the array elements");
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;

		arr[1][0] = 4;
		arr[1][1] = 5;
		arr[1][2] = 6;

		arr[2][0] = 8;
		arr[2][1] = 9;
		arr[2][2] = 10;

		for (int[] a1 : arr) {
			for (int a : a1) {
				System.out.print(a+" ");
			}
			System.out.println();
		}

//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
//
//		}
	}

}
