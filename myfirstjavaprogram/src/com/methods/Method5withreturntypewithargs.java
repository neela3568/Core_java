package com.methods;

import java.util.Scanner;

public class Method5withreturntypewithargs {

	double AreaOfCircle(double r) {
		double pi = Math.PI;
		double ac = pi * r * r;
		return ac;

	}
	double AreaOfTriangle(double base , double height) {
		double at = base * height / 2;
		return at;
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		System.out.println("***************************");

		// creating Scanner object for reading elements from console
		Scanner sc = new Scanner(System.in);

		// reading the radius from the scanner
		System.out.println("Enter radius:");
		double w = sc.nextDouble();

		// creating an object for instance method
		Method5withreturntypewithargs n = new Method5withreturntypewithargs();

		double a = n.AreaOfCircle(w);
		System.out.println("AreaOfCircle:" + a);
		System.out.println("*************************************");
		System.out.println("Enter Base:");
		double b= sc.nextDouble();
		
		System.out.println("Enter height:");
		double c = sc.nextDouble();
		
		double x = n.AreaOfTriangle(b,c);
		System.out.println("AreaOfTriangle:"+ x);
		
		

	}

}
