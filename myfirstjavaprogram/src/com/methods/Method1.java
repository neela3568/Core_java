package com.methods;

//can we access static data by using object reference variable...? 
public class Method1 {
	// static data + primitive data
	static int num  = 1;
	// static data + object data type
	static String name = "Akhil";

	// instance data + primitive data
	int id;
	// instance data + object data type
	String orgname;
	
	void method2() {
		int s = 654;
		String s1 = "neymar";
		int rollno = 23;
		String s3 = "chirala";
		System.out.println(s);
		System.out.println(s1);
		System.out.println(rollno);
		System.out.println(s3);
	}

	public static void main(String[] args) {
		System.out.println("*******main methos started********");

		int a = 234;
		System.out.println(a);

		// creating an object
		Method1 n = new Method1();
		Method1 n2 = null;
		
		 n.method2();
		 
		 System.out.println("********************");
		 System.out.println(n2.num);
		 System.out.println(n2.id);//NPE: null pointer exception

		// Accessing the static data directle
		System.out.println(num);
		System.out.println(name);

		// Accessing the instance data by using object reference variable
		System.out.println(n.id);
		System.out.println(n.orgname);

		// Access the static data by using object reference variable
		// The static field Method1.num should be accessed in a static way
		System.out.println(n.num);
		System.out.println(n.name);

	}

}
