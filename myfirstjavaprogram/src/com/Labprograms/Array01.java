package com.Labprograms;

public class Array01 {

	public static void main(String[] args) {
		System.out.println("Main method stated");
		int[] a = { 1, 2, -3, 4, -5, 7 };
		int store = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i] > 0 || a[j] < 0) {
					
					int temp=a[i];
					a[i]=a[j+1];
					
					 
				}else {
					
				}
			}
		}
	}
}