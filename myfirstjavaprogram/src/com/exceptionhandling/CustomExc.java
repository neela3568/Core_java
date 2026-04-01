package com.exceptionhandling;

import java.util.Scanner;

public class CustomExc {

	public static void main(String[] args) throws NeelaException{
		System.out.println("Main method started");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = sc.nextInt();
		
		if(age>=18) {
			System.out.println("your eligible for voting");
		}else {
			 throw new NeelaException("Niku enka time undi ra babu");
		}
	}

}
