package com.Neela;

import java.util.Scanner;

public class Work16 {

	static boolean Armstrong(int n) {
		boolean status = false;
		int remainder = 0;
		int sumP = 0;
		int temp = n;
		
		//Wrapper Object
		String strnum = Integer.toString(n);
		int DigitCount = strnum.length();
		
		while (n != 0) {
			remainder = n % 10;//153%10-->3   15%10-->5   1%10-->1
			n = n / 10;//153/10-->15   15%10-->1   1%10-->0
			sumP = sumP + (int) Math.pow(remainder, DigitCount);

		}
		if(sumP == temp) {
			status = true;
			
		}

		return status;
	}

	public static void main(String[] args) {
		System.out.println("Main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		boolean boo = Armstrong(num);
		
		
		if(boo) {
			System.out.println("Armstrong number");
			
		}else {
			System.out.println("Not a Armstrong number");
		}

	}

}
