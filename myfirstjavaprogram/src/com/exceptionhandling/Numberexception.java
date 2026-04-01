package com.exceptionhandling;

public class Numberexception {
	public static void main(String[] args) {
		System.out.println("Main method started");
		int n = Integer.parseInt("ABC");

		try {
			System.out.println(n);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
