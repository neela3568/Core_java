package com.Labprograms;

public class Pencil {
	void method() {

		int amount = 100;
		int pencilcost = 7;
		int avg = (amount / pencilcost);
		int remaining = (amount - pencilcost * avg);
		System.out.println("pencils: " + avg);
		System.out.println("remaining amount: " + remaining);
	}

	public static void main(String[] args) {
		Pencil t1 = new Pencil();
		t1.method();

	}

}
