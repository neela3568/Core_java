package com.Labprograms;

public class Varible {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c;
		c = a;
		a = b;
		b = c;
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		neela();

	}

	static void neela() {
		int a = 10;
		int b = 20;
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("a=" + a);
		System.out.println("b=" + b);

	}
}
