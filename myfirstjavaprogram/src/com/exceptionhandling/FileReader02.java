package com.exceptionhandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReader02 {

	public static void main(String[] args) throws FileNotFoundException, IOException, InterruptedException {
		System.out.println("Main ethod started");
		File f = new File("D:\\OOPS\\neela.txt");
		FileReader fr = new FileReader(f);
		int i = fr.read();

		while (i != -1) {
			System.out.print((char) i);
			i = fr.read();
			Thread.sleep(500);
		}
	}

}
