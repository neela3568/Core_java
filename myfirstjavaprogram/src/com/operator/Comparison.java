package com.operator;

import java.util.Scanner;

public class Comparison {

	public static void main(String[] args) {
		 System.out.println("Main method started");
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter a number");
		 int x = sc.nextInt();
		 String a =(x%2==0)?"even":"odd";
		 System.out.println(a);
	}

}
