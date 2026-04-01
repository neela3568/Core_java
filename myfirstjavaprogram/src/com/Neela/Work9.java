package com.Neela;

import java.util.Scanner;

public class Work9 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		if (num%2==0) {
			System.out.println(num+":true");
		}
		else {
			System.out.println(num+":false");
		}
	}

}
