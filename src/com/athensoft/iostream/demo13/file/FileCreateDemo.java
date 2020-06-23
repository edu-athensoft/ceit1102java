package com.athensoft.iostream.demo13.file;

import java.io.File;

public class FileCreateDemo {

	public static void main(String[] args) {
		createFileObj();
	}
	
	public static void createFileObj() {
		final String PATH_NAME = ".\\src\\com\\athensoft\\iostream\\demo12\\file\\mydir";
		
		File myfile = new File(PATH_NAME);
		
		System.out.println("File Object: "+myfile.toString());
	}

}
