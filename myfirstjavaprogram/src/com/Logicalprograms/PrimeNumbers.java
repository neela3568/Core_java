package com.Logicalprograms;

import java.util.Scanner;

public class PrimeNumbers {

	static boolean isprime(int n) {
		boolean status = true;

		if (n == 0 || n == 1) {
			return false;
		}
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				return false;
			}
		}

		return status;
	}

	public static void main(String[] args) {
		System.out.println("*************Prime Numbers**************");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number up to where you want");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			if (isprime(i)) {
				System.out.print(i + " ");
			}
		}
	}

}
