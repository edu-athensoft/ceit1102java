package com.athensoft.iostream.demo1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class DemoFileInputStream {
	public static void main(String[] args) {
		
		//create InputStream object using FileInputStream
		InputStream input = null;
		try {
			input = new FileInputStream(".\\src\\com\\athensoft\\iostream\\demo1\\input.txt");
			
			System.out.println("Available bytes in the file input.txt: " + input.available());
			
			System.out.println(input.toString());
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(input!= null) {
				try {
					input.close();
				} catch (IOException e) {
					//logger.log(Level.INFO, e.toString());
				}
			}
		}
	}
}
