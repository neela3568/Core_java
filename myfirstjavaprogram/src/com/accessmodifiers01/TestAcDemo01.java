package com.accessmodifiers01;

public class TestAcDemo01 {

	public TestAcDemo01() {

	}

	// instance block
	{
		System.out.println("Instance block");
	}

	// static block
	static {
		System.out.println("Static block");
	}

	// instance variables
	protected int num = 4;
	protected String name = "neela";

	// instance method
	  protected void method() {
		System.out.println("Welcome to vcube");
	}

	public static void main(String[] args) {
		System.out.println("Main method started from TestAcDemo01");
		TestAcDemo01 t1 = new TestAcDemo01();
		System.out.println(t1.num);
		System.out.println(t1.name);
		t1.method();

	}

}
