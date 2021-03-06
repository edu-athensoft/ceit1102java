package com.athensoft.iostream.demo17.inputstreamreader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderCreateDemo {

	public static void main(String[] args) {
		
		final String FILE_NAME = ".\\src\\com\\athensoft\\iostream\\demo17\\inputstreamreader\\file-data.txt";
		
		// Creates an InputStream
		FileInputStream file = null;
		
		// Creates an InputStreamReader
		InputStreamReader input = null;
		
		try {
			file = new FileInputStream(FILE_NAME);
			
			input = new InputStreamReader(file);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				input.close();
				file.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}

		

	}

}
