package com.athensoft.iostream.demo13.file;

import java.io.File;

public class FileMethodDeleteFile {

	public static void main(String[] args) {
		
		
		//create myfile3.txt first
		final String FILE_NAME = ".\\src\\com\\athensoft\\iostream\\demo13\\file\\myfile3.txt";
			
		// creates a file object
	    File file = new File(FILE_NAME);

	    // deletes the file
	    boolean value = file.delete();
	    if(value) {
	      System.out.println("The File is deleted.");
	    }
	    else {
	      System.out.println("The File is not deleted.");
	    }
	}

}
