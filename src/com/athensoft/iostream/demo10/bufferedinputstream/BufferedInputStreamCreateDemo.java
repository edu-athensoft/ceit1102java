package com.athensoft.iostream.demo10.bufferedinputstream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class BufferedInputStreamCreateDemo {

	public static void main(String[] args) {
		
	}
	
	
	/**
	 * 
	 */
	private static void createBufferedReader() {
		String path = "";
		
		// Creates a FileInputStream
		FileInputStream file;
		try {
			file = new FileInputStream(path);
			
			// Creates a BufferedInputStream
			BufferedInputStream buffer = new BufferedInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		
	}
	
	
	private static void createBufferedReader2() {
		String path = "";
		
		// Creates a FileInputStream
		FileInputStream file;
		try {
			file = new FileInputStream(path);
			
			// Creates a BufferedInputStream
			int size = 8192 *2;
			BufferedInputStream buffer = new BufferedInputStream(file, size);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		
	}
	

}
