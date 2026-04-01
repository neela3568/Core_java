package com.Arrays;

public class Array12jagged02 {

	public static void main(String[] args) {
		String[][] names = { { "Prabhas", "Allu Arjun", "Nani" }, { "Mahesh babu", "NTR" }, { "Surya" } };
		
		
//		for (String[] n1 : names) {
//			 for(String n : n1) {
//				 System.out.print(n+" | ");
//			 }
//			 System.out.println();
//			 System.out.println("--------------------");
//			 
//		 }

			for (int i = 0; i < names.length; i++) {
				for (int j = 0; j < names[i].length; j++) {
					System.out.print(names[i][j]+" ");
				}
				System.out.println();
			}
		}

	}

