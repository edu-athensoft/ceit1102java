package com.athensoft.iostream.demo12.printstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class PrintStreamCreateDemo {

	public static void main(String[] args) {
		final String FILE_NAME = ".\\src\\com\\athensoft\\iostream\\demo12\\printstream\\file-objects.txt";

		try {
			createByFileName(FILE_NAME);
			
			createByOtherStream(FILE_NAME);
			
			createByFileNameChartset(FILE_NAME, "UTF-8");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}

	}

	private static void createByOtherStream(String fname) throws FileNotFoundException {

		// Creates a FileOutputStream
		FileOutputStream file = new FileOutputStream(fname);

		// Creates a PrintStream
		// autoFlush = true, false
		PrintStream output = new PrintStream(file, true);

		output.close();
	}

	private static void createByFileName(String fname) throws FileNotFoundException {

		// Creates a PrintStream
		// autoFlush = true, false
		PrintStream output = new PrintStream(fname);

		output.close();
	}
	
	private static void createByFileNameChartset(String fname, String charset) throws FileNotFoundException, UnsupportedEncodingException {

		// Creates a PrintStream
		// CharSet
		PrintStream output = new PrintStream(fname, charset);

		output.close();
	}

}
