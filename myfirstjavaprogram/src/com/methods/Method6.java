package com.methods;

public class Method6 {
	public static void main(String[] args) {
		System.out.println("Main method started");
		addition();
		addition(10);
		addition(10.5f);
	}

	static void addition() {
		System.out.println("method 1");
	}

	static void addition(int a) {
		System.out.println("method 2");
	}

	static void addition(float a) {
		System.out.println("method 3");
	}

}
