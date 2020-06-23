package com.athensoft.iostream.demo14.dir;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;

public class FileCopyDemo {
	public static void main(String[] args) {

		final String PATH_NAME_1 = ".\\src\\com\\athensoft\\iostream\\demo14\\dir\\input.txt";
		final String PATH_NAME_2 = ".\\src\\com\\athensoft\\iostream\\demo14\\dir\\output.txt";

		try {

			RandomAccessFile f = new RandomAccessFile(PATH_NAME_1, "r");
			byte[] array = new byte[(int) f.length()];

//	    	byte[] array = new byte[50];

			FileInputStream sourceFile = new FileInputStream(PATH_NAME_1);
			FileOutputStream destFile = new FileOutputStream(PATH_NAME_2);

			// reads all data from input.txt
			sourceFile.read(array);

			// writes all data to newFile
			destFile.write(array);
			System.out.println("The input.txt file is copied to newFile.");

			// closes the stream
			sourceFile.close();
			destFile.close();
		} catch (Exception e) {
			e.getStackTrace();
		}
	}
}
