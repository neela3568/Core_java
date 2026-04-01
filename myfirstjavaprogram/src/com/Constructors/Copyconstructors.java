package com.Constructors;

public class Copyconstructors {
	String movie;
	String director;
	String hero;
	String heroine;
	double budget;
	
	 Copyconstructors(String director){
		 System.out.println("one arg constructor");
		 this.director = director;

		}
	 Copyconstructors(Copyconstructors c, String movie,String hero ){
		 System.out.println("two arg constructor");
		 this.director = c.director;
		 this.movie = movie;
		 this.hero = hero;
	 }
	 Copyconstructors(Copyconstructors c, Copyconstructors c2,String heroine,double budget){
		 System.out.println("two arg constructor");
		 this.movie = c2.movie;
		 this.hero = c2.hero;
		 this.director = c.director;
		 this.heroine = heroine;
		 this.budget = budget;
		 
	 }

	public static void main(String[] args) {
		System.out.println("Main method started");
		Copyconstructors c = new Copyconstructors("Rajamouli");
		c.show();
		
		Copyconstructors c1 = new Copyconstructors(c,"bahubali","prabhas");
		c1.show();
		
		Copyconstructors c2 = new Copyconstructors(c,c1,"samantha",2345678.0);
		c2.show();
	}

	void show() {
		System.out.println("***********************");
		System.out.println("Movie :" + movie);
		System.out.println("Director :" + director);
		System.out.println("Hero :" + hero);
		System.out.println("Heroine :" + heroine);
		System.out.println("Budget :" + budget);
	}

}
