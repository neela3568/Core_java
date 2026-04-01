package com.accessmodifers02;

import com.accessmodifiers01.TestAcDemo01;

public class TestAcDemo03 extends TestAcDemo01 {
	 

	public static void main(String[] args) {
		System.out.println("Main method started");
		TestAcDemo03 t1 = new TestAcDemo03();
		System.out.println(t1.num);
		System.out.println(t1.name);
		t1.method();
	}

}
