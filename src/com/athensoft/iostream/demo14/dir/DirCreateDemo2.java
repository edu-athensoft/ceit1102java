package com.athensoft.iostream.demo14.dir;

import java.io.File;

/**
 * Here, if the parent directory doesn't exist, then the mkdirs() method creates the parent directory as well along with the directory.
 * @author Athens
 *
 */
public class DirCreateDemo2 {
	public static void main(String[] args) {
		
		final String PATH_NAME = ".\\src\\com\\athensoft\\iostream\\demo14\\dir\\mydir2\\mysubdir";
		
		// creates a file object in current path
	    File file = new File(PATH_NAME);

	    // tries to create a new directory
	    boolean value = file.mkdirs();
	    if(value) {
	      System.out.println("The new directory is created.");
	    }
	    else {
	      System.out.println("The directory already exists.");
	    }
	}
}
