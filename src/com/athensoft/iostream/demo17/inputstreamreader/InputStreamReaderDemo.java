package com.athensoft.iostream.demo17.inputstreamreader;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class InputStreamReaderDemo {
	public static void main(String[] args) {
		
		final String FILE_NAME = ".\\src\\com\\athensoft\\iostream\\demo17\\inputstreamreader\\file-data.txt";
		
	    // Creates an array of character
	    char[] array = new char[100];

	    try {
	      // Creates a FileInputStream
	      FileInputStream file = new FileInputStream(FILE_NAME);

	      // Creates an InputStreamReader
	      InputStreamReader input = new InputStreamReader(file);

	      // Reads characters from the file
	      input.read(array);
	      System.out.println("Data in the stream:");
	      System.out.println(array);

	      // Closes the reader
	      input.close();
	    }

	    catch(Exception e) {
	      e.getStackTrace();
	    }
	  }
}
