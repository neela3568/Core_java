package com.stringHandling;

public class String05 {
	public static void main(String[] args) {
		System.out.println("Main method started");
		StringBuffer b1 = new StringBuffer();
		b1.append("neelaneelaneelan");
		System.out.println(b1.capacity());//16*2+2=34
	}

}
