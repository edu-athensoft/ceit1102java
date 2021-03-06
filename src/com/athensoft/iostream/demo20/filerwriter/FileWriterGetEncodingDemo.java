package com.athensoft.iostream.demo20.filerwriter;

import java.io.FileWriter;
import java.nio.charset.Charset;

/**
 * The getEncoding() method can be used to get the type of encoding that is used to store data in the input stream.
 * @author Athens
 *
 */
public class FileWriterGetEncodingDemo {
	public static void main(String[] args) {

		final String FILE_NAME = ".\\src\\com\\athensoft\\iostream\\demo17\\inputstreamreader\\file-data.txt";
		
		
		
		String file = "output.txt";

	    try {
	      // Creates a FileReader with default encoding
	      FileWriter output1 = new FileWriter(file);

	      // Creates a FileReader specifying the encoding
//	      FileWriter output2 = new FileWriter(file, Charset.forName("UTF8"));

	      // Returns the character encoding of the reader
	      System.out.println("Character encoding of output1: " + output1.getEncoding());
//	      System.out.println("Character encoding of output2: " + output2.getEncoding());

	      // Closes the reader
	      output1.close();
//	      output2.close();
	    }

	    catch(Exception e) {
	      e.getStackTrace();
	    }

	}
}
