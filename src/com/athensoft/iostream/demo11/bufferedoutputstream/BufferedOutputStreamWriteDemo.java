package com.athensoft.iostream.demo11.bufferedoutputstream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class BufferedOutputStreamWriteDemo {
	public static void main(String[] args) {

		final String FILE_NAME = ".\\src\\com\\athensoft\\iostream\\demo11\\bufferedoutputstream\\file-objects.txt";

		String data = "This is a bufferedOutputStream demo 123";

		try {
			// Creates a FileOutputStream
			FileOutputStream file = new FileOutputStream(FILE_NAME);

			// Creates a BufferedOutputStream
			BufferedOutputStream output = new BufferedOutputStream(file);

			byte[] array = data.getBytes();

			// Writes data to the output stream
			output.write(array);
			output.close();

			System.out.println("Done");
		}

		catch (Exception e) {
			e.getStackTrace();
		}
	}

}
