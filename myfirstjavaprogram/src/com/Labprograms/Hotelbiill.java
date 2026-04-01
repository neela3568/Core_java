package com.Labprograms;

public class Hotelbiill {
	static int totalamount;
	static int GST = 50;

	void veg() {
		int samosa = 15;
		int palakpaneer = 45;
		int vegbiriyani = 50;

		totalamount += samosa + palakpaneer + vegbiriyani;
	}

	void Non_veg() {
		int bawachibiriyani = 250;
		int chickencurry = 60;
		totalamount += bawachibiriyani + chickencurry;

	}

	void dessert() {
		int chickenwings = 80;
		int chickenpices = 100;
		int chickenpopcon = 250;
		totalamount += chickenwings + chickenpices + chickenpopcon + GST;

	}

	static void display() {

		System.out.println("BILL");
		System.out.println("..................");
		System.out.println("GST:" + GST);
		System.out.println("TOTAL AMOUNT:" + totalamount);

	}

	public static void main(String[] args) {
		Hotelbiill n = new Hotelbiill();
		n.veg();
		n.Non_veg();
		n.dessert();
		display();

		Hotelbiill n1 = new Hotelbiill();
		n1.veg();
		n1.Non_veg();

		 

	}

}
