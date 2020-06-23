package com.athensoft.iostream.demo12.printstream;

import java.io.PrintStream;

public class PrintStreamPrintDemo {

	public static void main(String[] args) {
		
//		print();
		printf();
//		print();
	}
	
	
	public static void print() {
		String data = "This is a text inside the file.";
		
		final String FILE_NAME = ".\\src\\com\\athensoft\\iostream\\demo12\\printstream\\file-objects.txt";
		PrintStream output = null;
		
        try {
            output = new PrintStream(FILE_NAME);

            output.print(data);
            output.close();
        }
        catch(Exception e) {
            e.getStackTrace();
        }finally {
        	if (output !=null) {
        		output.close();
        	}
        }
	}
	
	public static void printf() {
		
		final String FILE_NAME = ".\\src\\com\\athensoft\\iostream\\demo12\\printstream\\file-objects.txt";
		PrintStream output = null;
        try {
            output = new PrintStream(FILE_NAME);

            int age = 25;

            output.printf("I am %d years old.", age);
            output.close();

        }
        catch(Exception e) {
            e.getStackTrace();
        }finally {
        	if (output !=null) {
        		output.close();
        	}
        }
	}

}
