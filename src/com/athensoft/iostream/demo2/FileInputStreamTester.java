package com.athensoft.iostream.demo2;

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
 * Read data by the length of bytes
 * 
 * @author Athens
 *
 */
public class FileInputStreamTester {
	
	static Logger logger = Logger.getLogger(FileInputStreamTester.class.getName());
	
	public static void main(String[] args) {
		
		System.out.println("=== Starting InputStream.FileInputStream Program ===");
		
		InputStream input = null;
//		byte[] array = new byte[0];		//specify how many bytes it reads
//		byte[] array = new byte[1];		//specify how many bytes it reads
//		byte[] array = new byte[2];		//specify how many bytes it reads
		byte[] array = new byte[100];		//specify how many bytes it reads
		
		try {
			// Creates an InputStream
			input = new FileInputStream(".\\src\\com\\athensoft\\iostream\\demo2\\input.txt");

            // Read byte from the input stream
            input.read(array);
            System.out.println("Data read from the file: ");

            // Convert byte array into string
            String data = new String(array);
            System.out.println(data);
            System.out.println("=== EOF ===");
            
            // Close the input stream
            input.close();
		} 
		
		catch (FileNotFoundException  e) {
			logger.log(Level.INFO, e.toString());
			System.err.println("[Error] No such file.");
		} catch (IOException e) {
			logger.log(Level.INFO, e.toString());
			System.err.println("[Error] I/O error.");
		} finally {
			if(input!= null) {
				try {
					input.close();
				} catch (IOException e) {
					logger.log(Level.INFO, e.toString());
				}
			}
			
		}
		
		
	}

}
