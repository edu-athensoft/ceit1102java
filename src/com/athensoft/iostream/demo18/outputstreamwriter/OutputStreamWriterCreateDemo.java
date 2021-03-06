package com.athensoft.iostream.demo18.outputstreamwriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

public class OutputStreamWriterCreateDemo {

	public static void main(String[] args) {
		
		final String FILE_NAME = ".\\src\\com\\athensoft\\iostream\\demo18\\outputstreamwriter\\file-data.txt";
		
		// Creates an InputStream
		FileOutputStream file = null;
		
		// Creates an InputStreamReader
		OutputStreamWriter output = null;
		
		try {
			// Creates an OutputStream
			file = new FileOutputStream(FILE_NAME);

			// Creates an OutputStreamWriter
			output = new OutputStreamWriter(file);
			
			// Creates an OutputStreamWriter specifying the character encoding
//			output = new OutputStreamWriter(file, Charset.forName("UTF-8"));
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				output.close();
				file.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}

		

	}

}
