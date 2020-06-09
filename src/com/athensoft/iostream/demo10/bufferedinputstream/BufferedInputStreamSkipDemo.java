package com.athensoft.iostream.demo10.bufferedinputstream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputStreamSkipDemo {
	public static void main(String args[]) {
		
		final String FILE_NAME = ".\\src\\com\\athensoft\\iostream\\demo10\\bufferedinputstream\\file-objects.txt";
		
		try {
	         // Suppose, the input.txt file contains the following text
	         // This is a line of text inside the file.
	         FileInputStream file = new FileInputStream(FILE_NAME);

	         // Creates a BufferedInputStream
	         BufferedInputStream buffer = new BufferedInputStream(file);

	         // Skips the 5 bytes
	         buffer.skip(5);
	         System.out.println("Input stream after skipping 5 bytes:");

	         // Reads the first byte from input stream
	         int i = buffer.read();
	         while (i != -1) {
	            System.out.print((char) i);

	            // Reads next byte from the input stream
	            i = buffer.read();
	         }

	         // Closes the input stream
	         buffer.close();
	      }

	      catch (Exception e) {
	         e.getStackTrace();
	      }
	   }

}
