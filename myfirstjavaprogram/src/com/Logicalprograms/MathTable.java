package com.Logicalprograms;

import java.util.Scanner;

public class MathTable {

	public static void main(String[] args) {
		System.out.println("MAin method started");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number for math table");
		int num = sc.nextInt();
		
		System.out.println("up to where you want");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println(num + "X" + i + "=" + num * i);
		}
		
	}

}
