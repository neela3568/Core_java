package com.exceptionhandling;

import java.io.File;
import java.io.IOException;

public class FileCreate01 {

	public static void main(String[] args) throws IOException {
		System.out.println("Main method started");
		File f = new File("D:\\OOPS\\neela.txt");

		if (!f.exists()) {
			boolean status = f.createNewFile();
			if (status) {
				System.out.println("File is created successfully");
			} else {
				System.out.println("Something went wrongh");
			}

		} else {
			System.out.println("Already you created the file using this name");
		}

	}
}
