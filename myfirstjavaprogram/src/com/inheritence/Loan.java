package com.inheritence;

import java.util.Scanner;

public class Loan {

	static Scanner sc = new Scanner(System.in);

	String address() {
		String address = "";

		System.out.println("Enter your city name:");
		String city = sc.next();

		System.out.println("Enter your village name:");
		String village = sc.next();

		System.out.println("Enter your Street name:");
		String street = sc.next();

		System.out.println("Enter your Pan:");
		String pan = sc.next();

		System.out.println("Enter your pincode:");
		String pincode = sc.next();

		address = "City = " + city + ",village = " + village + ",street = " + street + ",pan = " + pan + ",pincode = " + pincode;

		return address;

	}

	boolean validateAadhaarAndPhoneAndPanDetails() {

		System.out.println("Enter Aadhaar number:");
		String aadhaar = sc.next();

		System.out.println("Enter phone number:");
		String phone = sc.next();

		System.out.println("Enter PAN number:");
		String pan = sc.next();

		boolean isAadhaarValid = aadhaar.matches("^[0-9]{12}$");
		boolean isPhoneValid = phone.matches("^[0-9]{10}$");
		boolean isPanValid = pan.matches("^[A-Z]{5}[0-9]{4}[A-Z]$");

		return isAadhaarValid && isPhoneValid && isPanValid;
	}

	double getRoI() {
		return 9.5;
	}

	int cibilScore() {
		System.out.println("Enter cibil Score:");
		int cibil = sc.nextInt();
		return cibil;
	}

	int ageInfo() {
		System.out.println("Enter your age");
		int age = sc.nextInt();
		return age;
	}

	int customerSalaryInfo() {
		System.out.println("Enter your salary");
		int salary = sc.nextInt();
		return salary;
	}

}
