package com.exceptionhandling;

public class Exc07 {

	public static void main(String[] args) {
		System.out.println("Main method started");
		try {
			System.out.println(10 / 0);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
	}

}
