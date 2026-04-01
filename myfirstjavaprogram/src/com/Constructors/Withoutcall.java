package com.Constructors;

public class Withoutcall {
	int id;
	String name;
	int rollno;
	int age;
	Withoutcall(){
		this(4);
		System.out.println("no arg constructor");
	}
	Withoutcall(int id){
		this(id,"neela");
		System.out.println("one arg constructor");
	}
	
	Withoutcall(int id,String name){
		this(id,name,23);

		System.out.println("two arg constructor");
	}
	
	Withoutcall(int id,String name,int age){
		this(id,name,age,85);

		System.out.println("three arg constructor");
	}
	
	Withoutcall(int id,String name,int age,int rollno){

		System.out.println("four arg constructor");
		this.id = id;
		this.name = name;
		this.rollno = rollno;
		this.age = age;
	}
	
	

	public static void main(String[] args) 	{
		System.out.println("main method started");
		Withoutcall w = new Withoutcall();
		w.show();
	}
	void show() {
		System.out.println("Student id :"+ id);
		System.out.println("Student name :"+ name);
		System.out.println("Student rollno :"+rollno);
		System.out.println("Student age :"+ age);
	}

}
