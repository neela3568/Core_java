package com.exceptionhandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;

public class StringExhand {

	public static void main(String[] args)throws IOException  {
		System.out.println("Main method started");
		 FileReader  f = new FileReader("D:\\OOPS\\neela.txt");
		 BufferedReader b = new BufferedReader(f);
		 String line;
	        while ((line = b.readLine()) != null) {
	            System.out.println(line);
	        }

	        b.close();
		
	}

}
