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
 * FileInputStream.read()
 * Read data byte by byte
 * 
 * 
 * @author Athens
 *
 */
public class FileInputStreamReadTester {

	static Logger logger = Logger.getLogger(FileInputStreamReadTester.class.getName());

	public static void main(String[] args) {

		System.out.println("=== Starting InputStream.FileInputStream Program ===");

		InputStream input = null;

		try {
			// Creates an InputStream
			input = new FileInputStream(".\\src\\com\\athensoft\\iostream\\demo4\\fileinputstream\\input.txt");

			// Read byte from the input stream
			System.out.println("Data in the file: ");

			// Reads the first byte
			int i = input.read();

			while (i != -1) {
//			int a;
//			while ((a =input.read()) != -1) {
				System.out.print((char) i);
//				System.out.println("\t"+i);	

				// Reads next byte from the file
				i = input.read();
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
