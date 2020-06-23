package com.athensoft.iostream.demo14.dir;

import java.io.File;

public class DirListFileDemo {

	public static void main(String[] args) {
		
		final String PATH_NAME = ".\\src\\com\\athensoft\\iostream\\demo14\\dir";
		
		// creates a file object
	    File file = new File(PATH_NAME);

	    // returns an array of all files
	    String[] fileList = file.list();

	    for(String str : fileList) {
	    	File f = new File(PATH_NAME+"\\"+str);
	    	if(f.isDirectory()) {
	    		System.out.println("[Dir] "+str);
	    	}else {
	    		System.out.println("[File] "+str);
	    	}
	      
	    }
	}

}
