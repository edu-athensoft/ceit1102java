package com.athensoft.iostream.demo14.dir;

import java.io.File;

/**
 * 
 * @author Athens
 *
 */
public class FileRenameDemo {

	public static void main(String[] args) {
		
		final String OLD_FILE_NAME = ".\\src\\com\\athensoft\\iostream\\demo14\\dir\\myfile41.txt";
		final String NEW_FILE_NAME = ".\\src\\com\\athensoft\\iostream\\demo14\\dir\\myfile42.txt";
		
		// create a file object
	    File file = new File(OLD_FILE_NAME);
	      
	    // create a file
	    try {
	      boolean isCreated = file.createNewFile();
	      
	      if(isCreated) {
		      System.out.println("The file is created.");
		    }
		    else {
		      System.out.println("Failed to creat.");
		    }
	    }
	    catch(Exception e) {
	      e.getStackTrace();
	    }

	    // create an object that contains the new name of file
	    File newFile = new File(NEW_FILE_NAME);

	    // change the name of file
	    boolean value = file.renameTo(newFile);

	    if(value) {
	      System.out.println("The name of the file is changed.");
	    }
	    else {
	      System.out.println("The name cannot be changed.");
	    }
	}

}
