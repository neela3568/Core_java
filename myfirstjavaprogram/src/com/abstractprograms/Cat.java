package com.abstractprograms;

public class Cat implements Animal {
	
	@Override
	public void sound() {
		System.out.println("meow meow");
	}
	
	@Override
	public void eat() {
		System.out.println("rat");
	}
	
	@Override
	public void walk() {
		System.out.println("cat can walk");
	}

}
