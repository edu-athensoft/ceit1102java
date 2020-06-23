package com.athensoft.iostream.demo14.dir;

import java.io.File;
import java.util.Collections;

/**
 * List all files and directories recursively
 * Print out their names with indentation according to its level
 * @author Athens
 *
 */
public class DirListFileDemo2 {

	public static void main(String[] args) {
		final String PATH_NAME = ".\\src\\com\\athensoft\\iostream\\demo14\\dir";
		
		final int LEVEL = 0;
		listFileDirs(PATH_NAME, LEVEL);
		
	}
	
	private static void listFileDirs(String path, int level) {	
		// creates a file object
	    File file = new File(path);

	    // returns an array of all files
	    String[] fileList = file.list();

	    for(String str : fileList) {
	    	File f = new File(path+"\\"+str);
	    	if(f.isDirectory()) {
	    		System.out.println(String.join("", Collections.nCopies(level, "   "))+"[Dir] "+str);
	    		listFileDirs(path+"\\"+str, ++level);
	    		level--;
	    	}else {
	    		System.out.println(String.join("", Collections.nCopies(level, "   "))+"[File] "+str);
	    	}
	      
	    }
	}

}
