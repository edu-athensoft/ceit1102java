package com.athensoft.iostream.demo5.fileoutputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * InputStream Subclass: FileInputStream
 * 
 * FileOutputStream.write(byte[] array, int start, int length)
 * writes bytes to the file output stream
 * 
 * 
 * @author Athens
 *
 */
public class FileOutputStreamWriteByteArrayOverriteTester3 {

	static Logger logger = Logger.getLogger(FileOutputStreamWriteByteArrayOverriteTester3.class.getName());

	public static void main(String[] args) {

		System.out.println("=== Starting OutputStream.FileOutputStream Program ===");

		FileOutputStream output = null;

		try {
			// Creates an InputStream
			final String OUTPUT_FILE = ".\\src\\com\\athensoft\\iostream\\demo5\\fileoutputstream\\output.txt";
			output = new FileOutputStream(OUTPUT_FILE);

		
			//data
			String data = "This is a line of text inside the file.";
            byte[] array = data.getBytes();

            // Writes byte to the file
            final int START_POS = 2;
            final int LENGTH = 7;
            output.write(array, START_POS, LENGTH);
            
            //output
            System.out.println("Data to write: "+data);
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
