package com.athensoft.iostream.demo18.outputstreamwriter;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class OutputStreamWriterDemo {
	public static void main(String args[]) {

		final String FILE_NAME = ".\\src\\com\\athensoft\\iostream\\demo18\\outputstreamwriter\\file-data.txt";
		
	    String data = "This is a line of text inside the file.";

	    try {
	      // Creates a FileOutputStream
	      FileOutputStream file = new FileOutputStream(FILE_NAME);

	      // Creates an OutputStreamWriter
	      OutputStreamWriter output = new OutputStreamWriter(file);

	      // Writes string to the file
	      output.write(data);

	      // Closes the writer
	      output.close();
	    }

	    catch (Exception e) {
	      e.getStackTrace();
	    }
	  }

}
