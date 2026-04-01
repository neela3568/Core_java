package com.accessmodifiers01;

public class TestAcDemo02 {

	public static void main(String[] args) {
		System.out.println("Main method started from TestAcDemo02");
		TestAcDemo01 t1 = new TestAcDemo01();
		System.out.println(t1.num);
		System.out.println(t1.name);
		t1.method();
		 

	}

}
