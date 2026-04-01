package com.exceptionhandling;

public class ExHan3 {

	public static void main(String[] args) {
		System.out.println("Main method stated");
		try {
			System.out.println("in try");
			int a = 100/2;//50
			String name = "Srikanth";
			System.out.println(name.charAt(7));
		}catch(Exception e) {
			System.out.println("in catch");
			System.out.println(e.getMessage());
		}
		System.out.println("main method ended");
	}

}
