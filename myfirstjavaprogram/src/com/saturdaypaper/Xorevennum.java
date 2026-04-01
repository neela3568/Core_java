package com.saturdaypaper;

public class Xorevennum {

	public static void main(String[] args) {
		System.out.println("Xor Even and Odd numbers");
		int a = 100;
		int b = 150;
		System.out.println("Even numbers");

		for(int i = a; i <= b; i++) {
			if((i ^ 1 )== (i + 1)) {
 				System.out.println(i + "");
			}
		}
		for(int i = a; i <= b; i++) {
			if((i & 1)== 0) {
				System.out.println(i);
			}
		}
		for(int i = a; i <= b; i++) {
			if ((i | 1)==  i+1) {
				System.out.println(i);
			}
			 
		}
		
		


		
	}

}
