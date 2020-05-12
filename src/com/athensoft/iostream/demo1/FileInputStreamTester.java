package com.athensoft.iostream.demo1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * InputStream
 * Subclass: FileInputStream
 * 
 * available() - returns the number of bytes available in the input stream
 * 
 * @author Athens
 *
 */
public class FileInputStreamTester {
	
	static Logger logger = Logger.getLogger(FileInputStreamTester.class.getName());
	
	public static void main(String[] args) {
		
		System.out.println("=== Starting InputStream.FileInputStream Program ===");
		
		InputStream input = null;
		InputStream input2 = null;
		
		try {
			// Creates an InputStream
			input = new FileInputStream(".\\src\\com\\athensoft\\iostream\\demo1\\input.txt");
//			input = new FileInputStream("input.txt");		//raise an FileNoFoundException
			
			System.out.println("Available bytes in the file input.txt: " + input.available());
			
			// Close the input stream
            input.close();
            
            
            // Creates an InputStream
			input2 = new FileInputStream(".\\src\\com\\athensoft\\iostream\\demo1\\input2.txt");
			
			System.out.println("Available bytes in the file input2.txt: " + input2.available());
			
			// Close the input stream
	         input2.close();
            
            
            
		} 
		
		catch (FileNotFoundException  e) {
			logger.log(Level.INFO, e.toString());
			System.err.println("[Error] No such file.");
		} catch (IOException e) {
			logger.log(Level.INFO, e.toString());
			System.err.println("[Error] I/O error.");
		} 
		
		/**
		finally {
			if(input!= null) {
				try {
					input.close();
				} catch (IOException e) {
					logger.log(Level.INFO, e.toString());
				}
			}
			if(input2!= null) {
				try {
					input2.close();
				} catch (IOException e) {
					logger.log(Level.INFO, e.toString());
				}
			}
		}**/
		
		
	}

}
