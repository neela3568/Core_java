package com.exceptionhandling;

import java.io.File;
import java.io.IOException;

public class IOException01 {

	public static void main(String[] args) throws IOException {
		System.out.println("Main method stated");
		File f = new File("D:\\OOPS\\neela.doc");

		f.createNewFile();

	}

}
