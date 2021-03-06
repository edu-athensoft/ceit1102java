package com.athensoft.iostream.demo17.inputstreamreader;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

/**
 * The getEncoding() method can be used to get the type of encoding that is used to store data in the input stream.
 * @author Athens
 *
 */
public class InputStreamReaderGetEncodingDemo {
	public static void main(String[] args) {

		final String FILE_NAME = ".\\src\\com\\athensoft\\iostream\\demo17\\inputstreamreader\\file-data.txt";
		try {
			// Creates a FileInputStream
			FileInputStream file = new FileInputStream(FILE_NAME);

			// Creates an InputStreamReader with default encoding
			InputStreamReader input1 = new InputStreamReader(file);

			// Creates an InputStreamReader specifying the encoding
			InputStreamReader input2 = new InputStreamReader(file, Charset.forName("UTF-16BE"));

			// Returns the character encoding of the input stream
			System.out.println("Character encoding of input1: " + input1.getEncoding());
			System.out.println("Character encoding of input2: " + input2.getEncoding());

			// Closes the reader
			input1.close();
			input2.close();
		}

		catch (Exception e) {
			e.getStackTrace();
		}
	}
}
