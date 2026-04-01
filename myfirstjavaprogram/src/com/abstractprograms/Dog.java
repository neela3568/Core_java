package com.abstractprograms;

public class Dog implements Animal{

	@Override
	public void sound() {
		System.out.println("baw baw");
	}

	@Override
	public void eat() {
		System.out.println("dog can eat meat");
	}

	@Override
	public void walk() {
		System.out.println("dog can walk");
	}
	
	 @Override
	public void sleep() {
		System.out.println("dogs are sleep in morning time and walk up in night times");
		
	}

}
