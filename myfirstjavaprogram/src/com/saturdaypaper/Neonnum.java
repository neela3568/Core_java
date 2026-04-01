package com.saturdaypaper;
//

//Take 9
//Square = 9 × 9 = 81
//Sum of digits = 8 + 1 = 9
//Here sum = number → so 9 is a Neon number.

import java.util.Scanner;

public class Neonnum {

	public static void main(String[] args) {
		System.out.println("Main method started");
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int square = num * num;  // square of the number
        int sum = 0;

        // using for loop to find sum of digits
        for (; square > 0; square = square / 10) {
            int digit = square % 10;
            sum = sum + digit;
        }

        // check if Neon number
        if (sum == num) {
            System.out.println(num + " is a Neon Number");
        } else {
            System.out.println(num + " is NOT a Neon Number");
        }
    }
}
