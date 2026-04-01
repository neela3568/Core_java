package com.saturdaypaper;

public class Bank {

	private double balance;

	public void bank(double balance) {
		this.balance = balance;
	}

	public void deposit(double amt) {
		if (amt < 0) {
			System.out.println("INVALID");
		}
		balance += amt;
	}

	public void withdrawal(double amt) {
		if (amt <= 0 || amt > balance) {
			System.out.println("invalid");
		}
		balance -= amt;
	}

	public double getbank() {
		return balance;
	}

}
