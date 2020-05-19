package com.athensoft.iostream.demo5.fileoutputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * InputStream Subclass: FileOutputStream
 * 
 * FileOutputStream.write()
 * writes bytes to the file output stream
 * 
 * 
 * @author Athens
 *
 */
public class FileOutputStreamWriteSingleByteTester1 {

	static Logger logger = Logger.getLogger(FileOutputStreamWriteSingleByteTester1.class.getName());

	public static void main(String[] args) {

		System.out.println("=== Starting OutputStream.FileOutputStream Program ===");

		FileOutputStream output = null;

		try {
			// Creates an InputStream
			final String OUTPUT_FILE = ".\\src\\com\\athensoft\\iostream\\demo5\\fileoutputstream\\output.txt";
			output = new FileOutputStream(OUTPUT_FILE);

		
			//data
//			char b = 97;
//			char b = 'жа';	//refer to FileOutputStreamWriteCharTester
//			int b = 97;
			byte b = 97;

            // Writes byte to the file
            output.write(b);
            
            //output
            System.out.println("Data to write: "+(char)b);
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
