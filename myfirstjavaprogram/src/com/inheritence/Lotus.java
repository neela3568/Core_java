package com.inheritence;

class Flower{
	protected String name1 = "jasmin";
	
	void method1() {
		System.out.println("Flower method");
	}
	 
}

public class Lotus extends Flower {
	 
	String name = "lotus";
	
	void method2() {
		System.out.println("Lotus method");
	}

	public static void main(String[] args) {
		Lotus l = new Lotus();
		System.out.println(l.name1);
 		System.out.println(l.name);
		l.method1();
		l.method2();

	}

}
