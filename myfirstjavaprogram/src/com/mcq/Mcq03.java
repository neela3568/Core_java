package com.mcq;

public class Mcq03 {

	public static void main(String[] args) {
		System.out.println("Main method started");

		int x = 0;
		int y = 0;
		for (int z = 0; z < 5; z++) {
			if ((++x > 2) || (++y > 2)) {
				x++;
			}
		}
		System.out.println(x + " " + y);
	}
}
