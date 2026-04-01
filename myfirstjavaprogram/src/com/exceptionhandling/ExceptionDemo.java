package com.exceptionhandling;

public class ExceptionDemo {

	public static void main(String[] args) {
		 
		try {
			int[] arr = { 1, 2, 3, 4, 5, 6 };
			System.out.println(arr[123]);
		} catch (ArrayIndexOutOfBoundsException e) {
			 System.out.println("out of range");
			 e.printStackTrace();
		}

	}
}
