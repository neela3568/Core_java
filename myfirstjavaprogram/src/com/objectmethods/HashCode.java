package com.objectmethods;

public class HashCode {

	 
	@Override
	public int hashCode() {
		 int id = 100;
		 
		return  id;
	}
	public static void main(String[] args) {
		System.out.println("Main method started");
		HashCode h = new HashCode();
		System.out.println(h);
		System.out.println(h.hashCode());
	}

}
