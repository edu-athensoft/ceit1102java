package com.athensoft.iostream.demo13.file;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;

public class FileMethodReadfFile {

	public static void main(String[] args) {

		final String FILE_NAME = ".\\src\\com\\athensoft\\iostream\\demo13\\file\\myfile1.txt";

		FileReader input = null;

		try {

			RandomAccessFile f = new RandomAccessFile(FILE_NAME, "r");
			char[] array = new char[(int) f.length()];

//			char[] array = new char[100];

			// Creates a reader using the FileReader
			input = new FileReader(FILE_NAME);

			// Reads characters
			input.read(array);
			System.out.println("Data in the file:");
			System.out.println(array);

			// Closes the reader
			input.close();
		} catch (FileNotFoundException fe) {
			fe.getStackTrace();
		} catch (Exception e) {
			e.getStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
