package com.saturdaypaper;

public class Bank01 {

	public static void main(String[] args) {
		Bank b = new Bank();
		b.bank(50000);
		b.deposit(4000);
		b.withdrawal(60000);
		System.out.println(b.getbank());
	}

}
