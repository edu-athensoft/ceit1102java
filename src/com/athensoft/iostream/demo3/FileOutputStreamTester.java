package com.athensoft.iostream.demo3;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * @author Athens
 *
 */
public class FileOutputStreamTester {
	
	static Logger logger = Logger.getLogger(FileOutputStreamTester.class.getName());
	
	public static void main(String args[]) {
        String data = "This is a line of text inside the file.";
        
        OutputStream out = null;
        try {
        	
            out = new FileOutputStream(".\\src\\com\\athensoft\\iostream\\demo3\\output.txt");

            // Converts the string into bytes
            byte[] dataBytes = data.getBytes();

            // Writes data to the output stream
            out.write(dataBytes);
            System.out.println("Data is written to the file.");

            // Closes the output stream
            out.close();
        } catch (Exception e) {
            e.getStackTrace();
        } finally {
        	if (out!=null) {
        		try {
					out.close();
				} catch (IOException e) {
					logger.log(Level.INFO, e.toString());
				}
        	}
        }
    }

}
