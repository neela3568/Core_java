package com.Labprograms;

//byte,short,int,long,float,double,chat,boolean..
public class Wrapperobject {
	Integer i = 232;// Auto-boxing: primitive int converts to wrapperobject data type Integer
	int i1 = i;// Auto-unboxing:wrapper object data type Integer converts to primitive int

	Byte b = 12;// Auto-boxing: primitive int converts to wrapper object data type Byte
	byte b1 = b;// Auto-unboxing:wrapper object data type Byte converts to primitive int

	Short s = 6475;// Auto-boxing: primitive int converts to wrapper object data type Short
	short s1 = s;// Auto-unboxing:wrapper object data type Short converts to primitive int

	// Type mismatch: cannot convert from int to Long
//This is the wrapper Long l =12345678;...so wrapper Long connot store into int
	Long l = 123456789L;// Auto-boxing : primitive long converts to wrapper object data type Long
	long l1 = l;// Auto=unboxing : wrapper object data type converts to primitive long

	// Type mismatch: cannot convert from int to Float
//	Float f = 100;
	Float f = 100.0f;// Auto-boxing : primitive float convrts to wrapper object data type Float
	float f1 = f;// Auto-unboxing : wrapper object data type Float converts to primitive float

	Double d = 324.54;// Auto-boxing : primitive double convrts to wrapper object data type Double
	double d1 = d;// Auto-unboxing : wrapper object data type Double converts to primitive double

	// ASCII 65=A,66=B,.....90=Z, 97=a,....122=z
	Character c = 100;
	char c1 = c;

	// Type mismatch: cannot convert from int to Boolean
//	Boolean boo = 123;
	Boolean boo = false;
	boolean boo1 = boo;

	public static void main(String[] args) {
		Wrapperobject n = new Wrapperobject();
		System.out.println(n.i);
		System.out.println(n.i1);
		
		System.out.println(n.b);
		System.out.println(n.b1);
		
		System.out.println(n .s);
		System.out.println(n.s1);
		
		System.out.println(n.l);
		System.out.println(n.l1);
		
		System.out.println(n.d);
		System.out.println(n.d1);
		
		System.out.println(n.c);
		System.out.println(n.c1);
		
		System.out.println(n.boo);
		System.out.println(n.boo1);

	}

}
