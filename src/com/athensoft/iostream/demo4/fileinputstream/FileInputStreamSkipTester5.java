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
 * available()
 * To get the number of available bytes
 * 
 * 
 * @author Athens
 *
 */
public class FileInputStreamSkipTester5 {

	static Logger logger = Logger.getLogger(FileInputStreamSkipTester5.class.getName());

	public static void main(String[] args) {

		System.out.println("=== Starting InputStream.FileInputStream Program ===");

		InputStream input = null;

		try {
			// Creates an InputStream
			input = new FileInputStream(".\\src\\com\\athensoft\\iostream\\demo4\\fileinputstream\\input.txt");

			// Returns the number of available bytes
	         System.out.println("Available bytes at the beginning: " + input.available());

	      // Skips the 5 bytes
	         final int SKIPPED_LEN = 6;
	         long skipped = input.skip(SKIPPED_LEN);
	         System.out.println("Input stream after skipping bytes:");

	         // Returns the number of available bytes
	         System.out.println("Available bytes at the end: " + input.available());

	         // 
	         System.out.println("Skipped for "+skipped+" bytes");
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
