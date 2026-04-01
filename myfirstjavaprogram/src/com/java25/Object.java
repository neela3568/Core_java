package com.java25;

public class Object {
	
	Object(){
		System.out.println("no arg constructor");
	}
	Object(String name){
		System.out.println("parameterized constructor");
	}

	   void main( ) {
		System.out.println("Main method started");
		Object o = new Object("Neela");
		 
	}
//	   public static void main(String[] args) {
//		   System.out.println("jjjjjjj");
//			Object o = new Object( );
//
//		   
//	   }

}
