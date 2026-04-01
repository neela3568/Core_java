package com.methods;

public class Method2 {

	// Addition
	void addition() {
		System.out.println("addition");
		int a = 93;
		int b = 84;
		String n = "boss";
		System.out.println(n +(a + b)+ n );

	}

	//subtraction
	void subtraction() {
		System.out.println("subtraction");
		int a = 74;
		int b = 65;
		String m = "neymar";
		System.out.println( a-b);

	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Method2 n = new Method2();
		n.addition();
		n.subtraction();
		n.multiplication();
		n.modulus();
		n.division();
		System.out.println("main method ended");
	}
	
	//multiplication
	void multiplication() {
		System.out.println("multiplication");
		int a = 47;
		int b = 55;
		String n = "kamal";
		System.out.println( a * b );
	}
	
	void modulus() {
		System.out.println("modulus");
		int a = 86;
		int n = 4;
		System.out.println(a%n);
		
	}
	void division() {
		System.out.println("division");
		int a = 10;
		int b = 2;
		System.out.println(a/b);
		
	}
	
}
