package com.athensoft.iostream.demo2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesTester {

	public static void main(String[] args) {
		try {
			String content = readFirstLineFromFile(".\\src\\com\\athensoft\\iostream\\demo1\\input2.txt");
			
			System.out.println(content);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	static String readFirstLineFromFile(String path) throws IOException {
	    try (BufferedReader br = new BufferedReader(new FileReader(path))) {
	        return br.readLine();
	    }
	}

}
