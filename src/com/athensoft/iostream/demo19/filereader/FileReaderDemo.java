package com.athensoft.iostream.demo19.filereader;

import java.io.FileReader;

public class FileReaderDemo {

	public static void main(String[] args) {
		
		final String FILE_NAME = ".\\src\\com\\athensoft\\iostream\\demo19\\filereader\\file-data.txt";
		
		// Creates an array of character
	    char[] array = new char[100];

	    try {
	      // Creates a reader using the FileReader
	      FileReader input = new FileReader(FILE_NAME);

	      // Reads characters
	      input.read(array);
	      System.out.println("Data in the file: ");
	      System.out.println(array);

	      // Closes the reader
	      input.close();
	    }

	    catch(Exception e) {
	      e.getStackTrace();
	    }
	}

}
