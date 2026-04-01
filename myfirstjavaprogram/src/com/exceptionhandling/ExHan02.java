package com.exceptionhandling;

public class ExHan02 {

	public static void main(String[] args) {
		System.out.println("Main method started");

		try {
			String a = "Masthan";

			for (int i = 0; i < a.length(); i++) {
				for (int j = 0; j <= i; j++) {
					System.out.print(a.charAt(10) + " ");
				}
				System.out.println();
			}

		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("Error: String index out of range");
		}
	}
}