package com.Neela;

public class Work {
	static void method1(){
		
		System.out.println("hello method1");
		method2();
	}
	static void method2(){
		 
		System.out.println("hello method2");
		method3();
	}
	static void method3(){
		 
		System.out.println("hello method3");
		method4();
	}
	static void method4(){
		Work t = new Work();
		System.out.println("hello method4");
		t.neela5();
	}

	public static void main(String[] args) {
		System.out.println("start");
		method1();

	}
	void neela5(){
		
		System.out.println("hello method5");
		neela6();
	}
	void neela6(){
		 
		System.out.println("hello method6");
		neela7();
	}
	void neela7(){
		
		System.out.println("hello method7");
		neela8();
	}
	void neela8(){
		System.out.println("hello method8");
	}
	

}
