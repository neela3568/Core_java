package com.Neela;

import java.util.Scanner;

public class Wok10 {
	 static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("main method started");
		String a = show1();
		int b = show2();
		int c = show3();
		
		System.out.println("STUDENT NAME:"+ a);
		System.out.println("STUDENT NO:"+ b);
		System.out.println("STUDENT MARKS:"+ c);

		
		
	}
	static String show1() {
		System.out.println("enter student name:");
		String a = sc.next();
		return a;
	}
	static int show2() {
		System.out.println("enter student no:");
		int b = sc.nextInt();
		return b;
		}
	static int show3() {
		System.out.println("enter student marks:");
		int c = sc.nextInt();
		return c;
	}
}