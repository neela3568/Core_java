package com.Neela;

public class Sample {

	  void main(String[] args) {
		System.out.println("Main method started");
		addition(10);
		addition(10,20);
		addition(10,20,30);
		addition(10,20,30,40);
		 
		
		
	}
	void addition(int... i) {
		 for(int a : i) {
			 System.out.print(a);  
		 }
		  
	}

}
