package com.Labprograms;

public class TestDemo01 {

	public static void main(String[] args) {
		System.out.println("Main method started");
		String vowels = "a,e,i,o,u";
		String str = "Hello all good afternoon";
		System.out.println(str);
		for (int i = 0; i < str.length; i++) {
			if (str[i] == vowels) {
				System.out.println(str[i]);
			}
		}
	}

}
