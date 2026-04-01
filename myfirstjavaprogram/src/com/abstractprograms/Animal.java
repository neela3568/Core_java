package com.abstractprograms;

public abstract interface Animal {
	// All variables are public static final by default you defined or not
	public static final int Emp_id = 101;
	String Emp_Name = "Neela";

	// All methods are in interfaces,public and abstract methods you will give or
	// not
	public abstract void sound();

	abstract public void eat();

	public abstract void walk();

	default void sleep() {
		System.out.println("sleep in night times");
		breath();

	}
	static void run() {
		System.out.println("Animals can run and jump");
	}
	private void breath() {
		System.out.println("breath");
		System.out.println("breath");
		System.out.println("breath");
		System.out.println("breath");
		System.out.println("breath");
		System.out.println("breath");
	}
	

}
