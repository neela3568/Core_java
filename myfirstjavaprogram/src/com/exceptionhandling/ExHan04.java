package com.exceptionhandling;

public class ExHan04 {

	public static void main(String[] args) {
		System.out.println("Main method started");
		try {
			System.out.println("in try1");
			 
			try {
				System.out.println("in try2");
				System.out.println(10/0);
			}catch(Exception e) {
				System.out.println("in catch2");
			}
			finally {
				System.out.println("in fially2");
			}
		} catch (Exception e) {
 			System.out.println("in catch1");
 			try {
				System.out.println("in try2");
				System.out.println(10/0);
			}catch(Exception r) {
				System.out.println("in catch2");
			}
			finally {
				System.out.println("in fially2");
			}
		} finally {
			System.out.println("in finally1");
			try {
				System.out.println("in try2");
				System.out.println(10/0);
			}catch(Exception e) {
				System.out.println("in catch2");
			}
			finally {
				System.out.println("in fially2");
			}
		}
		System.out.println("Main method ended");
	}

}
