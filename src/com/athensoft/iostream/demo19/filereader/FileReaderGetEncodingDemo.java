package com.athensoft.iostream.demo19.filereader;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * The getEncoding() method can be used to get the type of encoding that is used to store data in the input stream.
 * @author Athens
 *
 */
public class FileReaderGetEncodingDemo {
	public static void main(String[] args) {

		final String FILE_NAME = ".\\src\\com\\athensoft\\iostream\\demo17\\inputstreamreader\\file-data.txt";
		
		
		
		try {
			// Creates a FileReader with default encoding
		      FileReader input1 = new FileReader(FILE_NAME);

		      // Creates a FileReader specifying the encoding
		      FileReader input2 = new FileReader(FILE_NAME);
//		      FileReader input2 = new FileReader(FILE_NAME, Charset.forName("UTF8"));	# jdk 11

		      // Returns the character encoding of the file reader
		      System.out.println("Character encoding of input1: " + input1.getEncoding());
//		      System.out.println("Character encoding of input2: " + input2.getEncoding());
		      
		      String s = "";
		      BufferedReader in = new BufferedReader(new FileReader(FILE_NAME));
				while( (s = in.readLine()) != null) {
						
					String UTF8Str = new String(s.getBytes(),"UTF-8");
					System.out.println(UTF8Str);
				}

		

		      // Closes the reader
		      input1.close();
//		      input2.close();
		}

		catch (Exception e) {
			e.getStackTrace();
		}
	}
}
