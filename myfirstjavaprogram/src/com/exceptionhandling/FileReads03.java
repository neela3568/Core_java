package com.exceptionhandling;

import java.io.File;

public class FileReads03  {
	public static void main(String[] args) {
		System.out.println("Main method started");
		File f = new File("D:\\OOPS");
		String[] names = f.list();
		int count = 0;
		for (String a : names) {
			System.out.println(a);
			count++;
		}
		System.out.println("Count Files" + count);
	}

}
