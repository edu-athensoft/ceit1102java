package com.athensoft.iostream.demo14.dir;

import java.io.File;

public class FileMoveDemo {
	public static void main(String[] args) {
		
		final String PATH_NAME = ".\\src\\com\\athensoft\\iostream\\demo14\\dir\\mydir4\\";
		final String PATH_NAME_TO = ".\\src\\com\\athensoft\\iostream\\demo14\\dir\\mydir4\\photo\\";
		
		File sourceFile = new File(PATH_NAME+"CoverPhoto.png");
		File destFile = new File(PATH_NAME_TO+"ProfilePhoto.png");
		 
		if (sourceFile.renameTo(destFile)) {
		    System.out.println("File moved successfully");
		} else {
		    System.out.println("Failed to move file");
		}
	}
}
