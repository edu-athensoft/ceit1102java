package com.athensoft.iostream.demo5.fileoutputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * InputStream Subclass: FileOutputStream
 * 
 * FileOutputStream.write(byte[] array)
 * writes a char other than ASCII to the file output stream
 * 
 * 
 * @author Athens
 *
 */
public class FileOutputStreamWriteCharTester {

	static Logger logger = Logger.getLogger(FileOutputStreamWriteCharTester.class.getName());

	public static void main(String[] args) {

		System.out.println("=== Starting OutputStream.FileOutputStream Program ===");

		FileOutputStream output = null;

		try {
			// Creates an InputStream
			final String OUTPUT_FILE = ".\\src\\com\\athensoft\\iostream\\demo5\\fileoutputstream\\output.txt";
			output = new FileOutputStream(OUTPUT_FILE);

		
			//data
			char[] b = {'a'};
			String s = new String(b);

            // Writes byte to the file
            output.write(s.getBytes());
            
            //output
            System.out.println("Data to write: "+s);
            System.out.println("Done in overwriting mode!");

            //close
            output.close();

		}

		catch (FileNotFoundException e) {
			logger.log(Level.INFO, e.toString());
			System.err.println("[Error] No such file.");
		} catch (IOException e) {
			logger.log(Level.INFO, e.toString());
			System.err.println("[Error] I/O error.");
		} finally {
			if (output != null) {
				try {
					output.close();
				} catch (IOException e) {
					logger.log(Level.INFO, e.toString());
				}
			}
		}

	}

}
