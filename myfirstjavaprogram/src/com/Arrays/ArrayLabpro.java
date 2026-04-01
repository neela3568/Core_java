package com.Arrays;

public class ArrayLabpro {

	public static void main(String[] args) {
		System.out.println("Main method started");
		int[] arr = {3,4,6,3,2,4,5,7};
		for(int i = 0;i<arr.length;i++) {
			int pos=i;
			int count=0;
			for(int j = pos-1;j>=0;j--) {
				if(arr[i]<=arr[j]) {
					count++;
				}
			}
			
			for(int j = pos+1;j<arr.length-1;j++) {
				if(arr[i]>=arr[j]) {
					count++;
				}
			}
			
		}
		
	}

}
