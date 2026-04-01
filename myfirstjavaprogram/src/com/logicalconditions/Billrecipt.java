package com.logicalconditions;

import java.util.Scanner;

public class Billrecipt {

	public static void main(String[] args) {
		System.out.println("Main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("********Our items*********");
		System.out.println("1.vegetables");
		System.out.println("2.fruits");
		System.out.println("3.leafs");
		
		System.out.println("Choose items");
		int items = sc.nextInt();
		switch(items) {
		case 1 -> {
			System.out.println("vegetables");
			System.out.println("Munakaya:"+ 10);
			System.out.println("dosakaya:"+ 40);
			System.out.println("potato:"+ 40);


		}
		case 2 ->{
			System.out.println("fruits");
			System.out.println("mango:"+ 60);
			System.out.println("banana:"+ 50);
			System.out.println("cherries:"+ 100);
		}
		case 3 ->{
			System.out.println("leafs");
			System.out.println("gongura:"+ 20);
			System.out.println("bachalakura:"+ 30);
			System.out.println("munagaku:"+ 10);
		}
		 
		}

	}

}
