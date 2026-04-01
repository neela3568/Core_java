package com.inheritence;

public class PersonalLoan extends Loan {

	public static void main(String[] args) {
		System.out.println("Main method Started");
		PersonalLoan pl = new PersonalLoan();
		int salary = pl.customerSalaryInfo();
		int age = pl.ageInfo();
		int cibilScore = pl.cibilScore();
		boolean isValidCustomer = pl.validateAadhaarAndPhoneAndPanDetails();

		if (salary >= 1500000.00 && age >= 27 && cibilScore >= 735) {
			System.out.println("Congratulations!! you loan got approved");
			System.out.println(" the loan rate of intrest is:" + pl.getRoI());
			System.out.println("Enter your Address:");
			String addr = pl.address();
			System.out.println("Address: " + addr);

		} else {
			System.out.println("Sorry !! your loan got rejected");
		}
	}

}
