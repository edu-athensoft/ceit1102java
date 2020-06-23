package com.athensoft.iostream.demo14.dir;

import java.io.File;

public class DirCreateDemo {

	public static void main(String[] args) {
		
		
		//if the PATH_NAME parent directory (..\\demo14\\dir) doesn't exist, then the mkdir() method cannot create the directory.
		
		final String PATH_NAME = ".\\src\\com\\athensoft\\iostream\\demo14\\dir\\mydir";
		
		// creates a file object with specified path
	    File file = new File(PATH_NAME);

	    // tries to create a new directory
	    boolean value = file.mkdir();
	    if(value) {
	      System.out.println("The new directory is created.");
	    }
	    else {
	      System.out.println("The directory already exists.");
	    }
	}

}
