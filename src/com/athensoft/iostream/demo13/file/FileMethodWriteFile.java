package com.athensoft.iostream.demo13.file;

import java.io.FileWriter;
import java.io.IOException;

public class FileMethodWriteFile {

	public static void main(String[] args) {
		final String FILE_NAME = ".\\src\\com\\athensoft\\iostream\\demo13\\file\\myfile2.txt";
		
		String data = "This is the data in the output file 1111";
		
		FileWriter output =null;
		
	     try {
	       // Creates a Writer using FileWriter
	       output = new FileWriter(FILE_NAME);

	       // Writes string to the file
	       // no need to convert to byte[]
	       output.write(data);
	       System.out.println("Data is written to the file.");

	       // Closes the writer
	       output.close();
	     }
	     catch (Exception e) {
	       e.getStackTrace();
	     }finally {
		    	if(output!=null) {
		    		try {
		    			output.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
		    	}
		    }
	}

}
