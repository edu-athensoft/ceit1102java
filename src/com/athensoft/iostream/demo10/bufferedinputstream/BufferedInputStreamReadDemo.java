package com.athensoft.iostream.demo10.bufferedinputstream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputStreamReadDemo {
	public static void main(String[] args) {

		final String FILE_NAME = ".\\src\\com\\athensoft\\iostream\\demo10\\bufferedinputstream\\file-objects.txt";

		try {

			// Creates a FileInputStream
			FileInputStream file = new FileInputStream(FILE_NAME);

			// Creates a BufferedInputStream
			BufferedInputStream input = new BufferedInputStream(file);

			// Reads first byte from file
			int i = input.read();

			while (i != -1) {
				System.out.print((char) i + ": ");

				// Reads next byte from the file
				System.out.println(i);
				i = input.read();

			}
			input.close();
		}

		catch (Exception e) {
			e.getStackTrace();
		}
	}

}
