package com.athensoft.iostream.demo13.file;

import java.io.File;

public class FileMethodCreateFile {

	public static void main(String[] args) {
		
		//directory must exist already
		
//		final String PATH_NAME = ".\\src\\com\\athensoft\\iostream\\demo13\\file\\myfile1.txt";
		final String PATH_NAME = ".\\src\\com\\athensoft\\iostream\\demo13\\file\\mydir\\myfile0.txt";
		
		// create a file object for the current location
	    File file = new File(PATH_NAME);

	    try {

	      // trying to create a file based on the object
	      boolean value = file.createNewFile();
	      if (value) {
	        System.out.println("The new file is created.");
	      }
	      else {
	        System.out.println("The file already exists.");
	      }
	    }
	    catch(Exception e) {
	      e.getStackTrace();
	    }
	  }

}
