package com.shallowcopyVsdeepcopy;

class Student implements Cloneable{
	int id;
	String name;
	Address address;
	
	@Override
	protected java.lang.Object clone() throws CloneNotSupportedException {
 		return super.clone();
	}
	 
	public Student(int id, String name, Address address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
}
class Address{
	String street;
	String city;
	public Address(String Street,String city) {
		this.street = Street;
		this.city = city;
	}
	
}

public class Shallowcopy {

	public static void main(String[] args) throws CloneNotSupportedException{
		System.out.println("Main method started");
		Address add = new Address("hyderabad","kphb");
		Student s = new Student(1,"neela",add);
		System.out.println(s.id);
		System.out.println(s.name);
		System.out.println(s.address.street);
		System.out.println(s.address.city);
		
		Student s1 = (Student )s.clone();
		System.out.println("**********Before shallow copy**********");
		System.out.println(s1.id);
		System.out.println(s1.name);
		System.out.println(s1.address.street);
		System.out.println(s1.address.city);
		System.out.println("********************");
		s1.address.city ="Ameerpet";
		s1.address.street ="jr nager";
		System.out.println("********After shallow copy***********");
		System.out.println(s.id);
		System.out.println(s.name);
		System.out.println(s.address.street);
		System.out.println(s.address.city);
		System.out.println("***********************");
		System.out.println(s1.id);
		System.out.println(s1.name);
		System.out.println(s1.address.street);
		System.out.println(s1.address.city);
		
 
		
		
	}

}
