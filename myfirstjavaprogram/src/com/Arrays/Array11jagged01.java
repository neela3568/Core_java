package com.Arrays;

public class Array11jagged01 {

	public static void main(String[] args) {
		System.out.println("Mainn method started");
		
		int[][] arr = new int[2][];//0,1
		
		arr[0] = new int[3];//0,1,2
		arr[1] = new int[4];//0,1,2,3
		
		arr[0][0] = 101;
		arr[0][1] = 102;
		arr[0][2] = 103;
		
		arr[1][0] = 104;
		arr[1][1] = 105;
		arr[1][2] = 106;
		arr[1][3] = 107;
		
		for(int[] a1:arr) {
			for(int a : a1) {
				System.out.print(a +" ");
			}
			System.out.println();
		} 
		
		
	}

}
