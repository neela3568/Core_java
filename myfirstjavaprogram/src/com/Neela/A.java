package com.Neela;

class C {
	int a = 9262;

	void hello() {
		System.out.println("neela");
	}

}

class D extends C {
	int a = 72729;

	void hello() {
		System.out.println("vijay");
	}
}

public class A {

	public static void main(String[] args) {

		C d = new D();
		d.hello();
		System.out.println(d.a);

	}

}
