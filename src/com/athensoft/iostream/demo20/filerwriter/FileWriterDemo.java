package com.athensoft.iostream.demo20.filerwriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) {
		
		final String FILE_NAME = ".\\src\\com\\athensoft\\iostream\\demo20\\filerwriter\\file-data.txt";
		
		String data = "This is the data in the output file demo20";
		
		FileWriter output = null;
	    try {
	    	
	      File file = new File(FILE_NAME);
	      
	      // Creates a FileWriter
	      output = new FileWriter(file);

	      // Writes the string to the file
	      output.write(data);

	      // Closes the writer
	      output.close();
	    }

	    catch (Exception e) {
	      e.getStackTrace();
	    } finally {
	    	try {
				output.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
	    }


	}

}
