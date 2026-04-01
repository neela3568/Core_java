package com.stringHandling;

import java.util.Scanner;

public class StHa01 {

	public static void main(String[] args) {
		System.out.println("Main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.nextLine();// aaaaaaaabbbbbbbbbcccccccc
		
		int count = 0;
		int[] arr = new int[127];
		for (int i = 0; i < str.length(); i++) {
			arr[str.charAt(i)] = arr[str.charAt(i)] + 1;
			count++;
			
		}

	}

}
