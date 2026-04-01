package com.Neela;

public class Work6 {
	static void method() {
		System.out.println("hello welcome");
	}
	void method1() {
		method();
		System.out.println("hello");
	}
	static Work6 t = new Work6();
	public static void main(String[] args) {
		t.method1();
	}

}
