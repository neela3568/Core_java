package com.saturdaypaper;
import java.lang.Math;
public class Banksum {
	 int principleAmount = 100000;
	 double Rateofinterest = 10;
	int n = 2;
	int tenuer = 5;
	
	double simpleinterest(){
		 double MaturityAmount1 = principleAmount*(1+Rateofinterest*tenuer/100);
		 return MaturityAmount1;
		
	}
	double campoundinterest() {
		double maturityAmount2 = principleAmount*Math.pow((1+(Rateofinterest/100)/n), n*tenuer);
		return maturityAmount2;
		
		
	}
	void maturityamount() {
		System.out.println("Simple Interest:"+ simpleinterest());
		System.out.println("Campound Interest:"+ campoundinterest());
	}

	public static void main(String[] args) {
		Banksum b = new Banksum();
		b.maturityamount();
		 
	 
		 
		
	}

}
