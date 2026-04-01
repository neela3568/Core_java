package com.inheritence;

public class HomeLoan extends Loan{

	public static void main(String[] args) {
		System.out.println("Main method started");
		HomeLoan h = new HomeLoan();
		int salary = h.customerSalaryInfo();
		int age =h.ageInfo();
		int cibilScore = h.cibilScore();
		boolean isValidCustomer = h.validateAadhaarAndPhoneAndPanDetails();

		if (salary >= 100000.00 && age >= 29 && cibilScore >= 750) {
			System.out.println("Congratulations!! you loan got approved");
			System.out.println(" the loan rate of intrest is:" + h.getRoI());
			System.out.println("Enter your Address:");
			String addr =h.address();
			System.out.println("Address: " + addr);

		} else {
			System.out.println("Sorry !! your loan got rejected");
		}
	}

}
