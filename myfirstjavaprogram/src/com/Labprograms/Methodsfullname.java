package com.Labprograms;

public class Methodsfullname {

	public static void main(String[] args) {
		 String d = firstname("Neela");
		 System.out.println("FIRST NAME IS:"+ d);
		 
		 String c = secondname("Rao");
		 System.out.println("SECOND NAME IS:"+ c);
		 
		 String s = fullname(d,c);
		 System.out.println("FULL NAME IS:"+s);
 	}

	public static String firstname(String a) {
 		 return a;
	}
	public static String secondname(String b) {
 		return b;
	}
	public static String fullname(String c,String d) {
		String l = c + d;
		return l;
	}
	

}
