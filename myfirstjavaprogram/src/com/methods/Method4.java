package com.methods;

import java.util.Scanner;

public class Method4 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("*********Employee detils*********");

		int f = Employeeid();
		String a = employeeName();
		char h = Employeegender();
		int b = Employeeage();
		double c = Employeesal();
		String d = Employeecity();
		float e = Employeeheight();
		double g = Employeeweight();
		long i = Employeephn();

		System.out.println("Enter Employee id:" + f);

		System.out.println("Employee Name:" + a);
		
		System.out.println("Enter Gender:"+h);

		System.out.println("Enter Employee age:" + b);

		System.out.println("Enter Employee sal:" + c);

		System.out.println("Enter Employee city:" + d);

		System.out.println("Enter Employee height:" + e);

		System.out.println("Enter Employee weight:" + g);

		System.out.println("Enter Employee phone number:" + i);
	}

	static int Employeeid() {
		System.out.println("Enter Employee id:");
		 

		return sc.nextInt();
	}

	static String employeeName() {
		System.out.println("Enter Employee name:");
		 return sc.next();

	}
	static char Employeegender() {
		System.out.println("Enter Gender:");
		return sc.next().charAt(0);
	}

	static int Employeeage() {
		System.out.println("Enter Employee age:");
 
		return sc.nextInt();

	}

	static double Employeesal() {
		System.out.println("Enter Employee sal:");
 
		return sc.nextDouble();
	}

	static String Employeecity() {
		System.out.println("Enter Employee city:");
 
		return sc.next();
	}

	static float Employeeheight() {
		System.out.println("Enter Employee height:");
 
		return sc.nextFloat();
	}

	static double Employeeweight() {
		System.out.println("Enter Employee weight");
	 
		return sc.nextDouble();
	}

	static long Employeephn() {
		System.out.println("Enter Employee phone number:");
 		return sc.nextLong();

	}
}
