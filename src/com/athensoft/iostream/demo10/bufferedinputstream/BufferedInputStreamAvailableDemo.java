package com.athensoft.iostream.demo10.bufferedinputstream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputStreamAvailableDemo {
	public static void main(String args[]) {

		final String FILE_NAME = ".\\src\\com\\athensoft\\iostream\\demo10\\bufferedinputstream\\file-objects.txt";

		try {

			// Suppose, the input.txt file contains the following text
			// This is a line of text inside the file.
			FileInputStream file = new FileInputStream(FILE_NAME);

			// Creates a BufferedInputStream
			BufferedInputStream buffer = new BufferedInputStream(file);

			// Returns the available number of bytes
			System.out.println("Available bytes at the beginning: " + buffer.available());

			// Reads bytes from the file
			buffer.read();
			buffer.read();
			buffer.read();

			// Returns the available number of bytes
			System.out.println("Available bytes at the end: " + buffer.available());

			buffer.close();
		}

		catch (Exception e) {
			e.getStackTrace();
		}
	}

}
