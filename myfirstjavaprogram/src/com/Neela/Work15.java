package com.Neela;

import java.util.Scanner;

public class Work15 {

	static int fiboncci(int n) {

		if (n <= 1) {
			return n;

		} else {
			return fiboncci(n - 1) + fiboncci(n - 2);
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enate a factor");
		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			System.out.print(fiboncci(i) + " ");
		}
	}

}
