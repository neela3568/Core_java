package com.Labprograms;

public class Dinner {
	static int friends = 4;
	static float bill = 1875;
	static int tipper = 10;

	public static void main(String[] args) {
		float tipamount = bill*tipper/100;
		System.out.println("TIPPER AMOUNT:"+tipamount);//187.5
		float totalamount = bill+tipamount;
		System.out.println("TOTAL AMOUNT:"+totalamount);//2062.5
		float spiltamount = totalamount/4;
		System.out.println("SPLIT AMOUNT:"+spiltamount);//515.625
		float remainingamount = totalamount%4;
		System.out.println("REMAING AMOUNT:"+remainingamount);//2.5
		
		 

	}

}
