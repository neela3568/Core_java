package com.Constructors;

 
public class Car {
	String cname;
	String ccolor;
	int cprice;
	Car(){
		System.out.println("no arg constructor");
	}
	Car(String cname,String ccolor,int cprice){
		this.cname = cname;
		this.ccolor = ccolor;
		this.cprice = cprice;
	}

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		Car c = new Car();
		c.show();
		
		Car c1 = new Car("suzzuki","balck",1200000);
		c1.show();
	}
	void show(){
		System.out.println("Car Name:"+cname);
		System.out.println("Car color:"+ccolor);
		System.out.println("Car price:"+cprice);
	}
	void show1(){
		
		System.out.println("type:"+type);
		System.out.println("brand:"+brand);
	}

}
