package com.oops;

class bankAccount {
	private String naccountNumber;
	private String holderName;
	private double balance;

	public bankAccount(String accNo, String holderName, double balance) {
		super();
		this.naccountNumber = accNo;
		this.holderName = holderName;
		this.balance = balance;
	}

	public String getNaccountNumber() {
		return naccountNumber;
	}

	public String getHolderName() {
		return holderName;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("Deposited: ₹" + amount);
		} else {
			System.out.println("Invalid deposit amount!");
		}
	}

	public void withdraw(double amount) {
		if (amount > 0 && balance >= amount) {
			balance -= amount;
			System.out.println("Withdrawn: ₹" + amount);
		} else {
			System.out.println("Insufficient funds!");
		}
	}
}

class SavingsAccount extends bankAccount {
	private  double MIN_BALANCE = 500;

	public SavingsAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
    }

	@Override
	public void withdraw(double amount) {
		if (amount > 0 && getBalance() - amount >= MIN_BALANCE) {
			super.withdraw(amount);
		} else {
			System.out.println("Withdrawal denied! Minimum balance ₹500 required.");
		}
	}
}
