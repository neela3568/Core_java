package com.logicalconditions;

import java.util.Scanner;

public class Switchcasenew {

	public static void main(String[] args) {
		System.out.println("Man method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number for days");
		int days = sc.nextInt();
		
		// only convertable int and string or enum
		switch(days) {
		case 1 -> System.out.println("sunday");
		case 2 -> System.out.println("monday");
		case 3 -> System.out.println("tuesday");
		case 4 -> System.out.println("wednesday");
		case 5 -> System.out.println("tursday");
		case 6 -> System.out.println("saterday");
		}
	}

}
