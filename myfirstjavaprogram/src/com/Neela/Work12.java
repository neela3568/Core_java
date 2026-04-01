package com.Neela;

import java.util.Scanner;

public class Work12 {

	public static void main(String[] args) {
		System.out.println("Main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		String empName = sc.next();

		System.out.println("Enter your salary");
		double empSalary = sc.nextDouble();

		System.out.println("Enter your experience");
		int empExperience = sc.nextInt();

		double bonus = 0;

		if (empExperience < 2) {
			bonus = empSalary * 5 / 100;
			System.out.println("Bonus : " + bonus);
			System.out.println("Total salary :" + (empSalary + bonus));

		}
		if (empExperience >= 2 && empExperience < 5) {
			bonus = empSalary * 5 / 100;
			System.out.println("Bonus : " + bonus);
			System.out.println("Total salary :" + (empSalary + bonus));

		}
		if (empExperience >= 5 && empExperience < 10) {
			bonus = empSalary * 15 / 100;
			System.out.println("Bonus : " + bonus);
			System.out.println("Total salary :" + (empSalary + bonus));

		}
		if (empExperience >= 10) {
			bonus = empSalary * 20 / 100;
			System.out.println("Bonus : " + bonus);
			System.out.println("Total salary :" + (empSalary + bonus));

		}

	}

}
