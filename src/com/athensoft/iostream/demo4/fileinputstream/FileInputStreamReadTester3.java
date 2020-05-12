package com.athensoft.iostream.demo4.fileinputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * InputStream Subclass: FileInputStream
 * 
 * read(byte[] array, int start, int length) - 
 * reads the number of bytes equal to length from the file and stores in 
 * the specified array starting from the position start
 * 
 * 
 * @author Athens
 *
 */
public class FileInputStreamReadTester3 {

	static Logger logger = Logger.getLogger(FileInputStreamReadTester3.class.getName());

	public static void main(String[] args) {

		System.out.println("=== Starting InputStream.FileInputStream Program ===");

		InputStream input = null;

		try {
			// Creates an InputStream
			input = new FileInputStream(".\\src\\com\\athensoft\\iostream\\demo4\\fileinputstream\\input.txt");

			// Read byte from the input stream
			System.out.println("Data in the file: ");
			
//			final int LENGTH = input.available();
//			final int LENGTH = 2;    	//less than the available length
			
			final int START_POS = 2;	//the position of array
			final int LENGTH = 3;
			final int SIZE = 5;		
		
			
			byte[] array = new byte[SIZE];
			
			// Reads and save into an array
			// Returns the length of the array
			int i = input.read(array, START_POS, LENGTH);
						
			System.out.println(String.valueOf(i));
			for(int b : array) {
				System.out.print(b+",");
			}

			input.close();
		}

		catch (FileNotFoundException e) {
			logger.log(Level.INFO, e.toString());
			System.err.println("[Error] No such file.");
		} catch (IOException e) {
			logger.log(Level.INFO, e.toString());
			System.err.println("[Error] I/O error.");
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					logger.log(Level.INFO, e.toString());
				}
			}
		}

	}

}
