package com.exceptionhandling;

public class ExHan05 {

	public static void main(String[] args)  {
		System.out.println("Main method started");
		
		
		try {
		System.out.println(10/0);
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Main method ended");
		
	}

}
