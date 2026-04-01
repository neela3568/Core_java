package com.Neela;
//byte,short,int,long,float,double,chat,boolean..
public class Work8 {
	// By default,all RHS values compiler consider as int only
	byte b = (byte)247;//Explicit type casting
	short s = b;//byte can coverts into short : Implicit type casting
	
	short sh = (short)32768;//Explicit type casting
	
	//The literal 2147483648 of type int is out of range 
	int i =(int)2147483648L;
	long l = i;
	
	//type mismatch: cannot convert from double to float
//	float f = 100.3;
	float f = 100.42345678945678F;
	
	float f1 = 345678934567890456f;
	
	double d = 234.4534567345D;
	
	char c =  'A';
	//ASCII 65=A,66=B,.....90=Z,  97=a,....122=z
	char c1 = 65;// int can converting to char
	char c2 = 65535;
	boolean boo = false;
	
	
	

	public static void main(String[] args) {
		Work8 j = new Work8();
		System.out.println("byte value:"+j.b);
		System.out.println("short value:"+j.s);
		System.out.println("short value:"+j.sh);
		System.out.println("int value:"+j.i);
		System.out.println("long value:"+j.l);
		System.out.println("float value:"+j.f);
		System.out.println("float value:"+j.f1);
		System.out.println("double value:"+j.d);
		System.out.println("char value:"+j.c);
		System.out.println("char value:"+j.c1);
		System.out.println("boolean value:"+j.boo);

		
	}

}
