package com.stringHandling;

public class String04 {

	public static void main(String[] args) {
		System.out.println("Main method started");
		//immutable.........
		String s1 = "neela";
		String s2 = "mahesh";
	    s1.concat(s2);
		System.out.println(s1);
		//mutable........
		StringBuffer b = new StringBuffer("neela");
		StringBuffer b2 = new StringBuffer("java");
		b.append(b2);
		System.out.println(b);
	}

}
