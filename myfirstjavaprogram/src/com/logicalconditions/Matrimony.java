package com.logicalconditions;

import java.util.Scanner;

public class Matrimony {

	public static void main(String[] args) {
		System.out.println("********Matrimony**********");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is your name");
		String name = sc.nextLine();
		
		System.out.println("How much your salary");
		double salary = sc.nextDouble();
		
		if(salary >= 2500000) {
			System.out.println("Okay.....Do you have assets!! How much?");
			int assets = sc.nextInt();
			
			if(assets >= 5000000) {
				System.out.println("Okay...Do have siblings");
				boolean siblings = sc.nextBoolean();
				
				if(!siblings) {
					System.out.println("Good......Do you have a drinking habit? ");
					boolean Drinking = sc.nextBoolean();
					if(!Drinking) {
					System.out.println("you like them");	
					}else {
						System.out.println("get back soon");
					}
				}else {
					System.out.println("get back soon....");
				}
			}else {
				System.out.println("get back soon...");
			}
		}else {
			System.out.println("get back soon....");
		}
		
		 
	}

}
