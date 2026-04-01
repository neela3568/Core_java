package com.Labprograms;

class student {
	int stuno;
	String sname;
	int smarks;
	teacher tee = new teacher();
}

class teacher {
	String Tname = "mahesh";
	String Tsub = "physics";
	int Tsalary = 23445;
}

public class objectdatatypes {
	Hotelbiill n =new Hotelbiill();
	String b = "neeela";
	String b1 = new String("neeela");
	String b2 ="neeela";
	String b3 =new String("neeela");
	
	

	public static void main(String[] args) {
		student m = new student();
		objectdatatypes o = new objectdatatypes();
		System.out.println(m.tee.Tname);
		System.out.println(m.tee.Tsub);
		System.out.println(m.tee.Tsalary);
		
		System.out.println(o.n.GST);
		
		System.out.println(o.b);
		System.out.println(o.b == o.b1);
		System.out.println(o.b == o.b2);
		System.out.println(o.b1 == o.b3);

		
	}

}
