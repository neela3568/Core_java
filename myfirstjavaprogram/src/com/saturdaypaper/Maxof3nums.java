package com.saturdaypaper;

import java.util.Scanner;

public class Maxof3nums {

	public static void main(String[] args) {
		System.out.println("************ Max three numbers **************");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		if(a>b && a>c) {
			System.out.println("max :" + a);
		}else if(b>a && a>c) {
			System.out.println("max :" + b);

		}else if (c>a && c>d){
			System.out.println("max :" + c);

		}else {
			System.out.println("max:" + d);
		}
	}
	

}
