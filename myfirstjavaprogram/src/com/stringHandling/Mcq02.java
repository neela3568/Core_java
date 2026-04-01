package com.stringHandling;

import java.util.Scanner;

public class Mcq02 {

	public static void main(String[] args) {
		System.out.println("Main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence");
		String name = sc.nextLine();
		String a1 = "";
		String a2 = "";

		for (int i = 0; i < name.length(); i++) {
			char a = name.charAt(i);

			if (a == 'a' || a == 'e' || a == 'i' || a == '0' || a == 'u') {
				a1 += a;
			} else {
				a2 += a;
			}

		}
		System.out.print("vowels = " + a1);
		System.out.print("\n");
		System.out.print("consonents = " + a2);

	}

}
