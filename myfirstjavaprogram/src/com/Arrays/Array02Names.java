package com.Arrays;

public class Array02Names {

	public static void main(String[] args) {
		System.out.println("Main method started");

		String[] names = new String[5];

		names[2] = "masthan";
		names[4] = "mahesh";
		names[3] = "sandeep";
		names[1] = "konda";
		names[0] = "vijay";

		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}

	}

}
