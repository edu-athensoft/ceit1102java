package com.athensoft.iostream.demo18.outputstreamwriter;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

/**
 * The getEncoding() method can be used to get the type of encoding that is used to store data in the input stream.
 * @author Athens
 *
 */
public class OutputStreamWriterGetEncodingDemo {
	public static void main(String[] args) {

		final String FILE_NAME = ".\\src\\com\\athensoft\\iostream\\demo18\\outputstreamwriter\\file-data.txt";
		try {
			// Creates an output stream
		      FileOutputStream file = new FileOutputStream(FILE_NAME);

		      // Creates an output stream reader with default encoding
		      OutputStreamWriter output1 = new OutputStreamWriter(file);

		      // Creates an output stream reader specifying the encoding
		      OutputStreamWriter output2 = new OutputStreamWriter(file, Charset.forName("UTF8"));

		      // Returns the character encoding of the output stream
		      System.out.println("Character encoding of output1: " + output1.getEncoding());
		      System.out.println("Character encoding of output2: " + output2.getEncoding());

		      // Closes the reader
		      output1.close();
		      output2.close();
		    }


		catch (Exception e) {
			e.getStackTrace();
		}
	}
}
