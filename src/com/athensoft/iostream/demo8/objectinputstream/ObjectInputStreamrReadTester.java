package com.athensoft.iostream.demo8.objectinputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectInputStreamrReadTester {
	public static void main(String[] args) {
		
		final String FILE_NAME = ".\\src\\com\\athensoft\\iostream\\demo8\\objectinputstream\\file-objects.txt";
		
        int data1 = 5;
        String data2 = "This is ObjectInputStream";

        try {
            FileOutputStream file = new FileOutputStream(FILE_NAME);
            ObjectOutputStream output = new ObjectOutputStream(file);

            // Writing to the file using ObjectOutputStream
            output.writeInt(data1);
            output.writeObject(data2);

            FileInputStream fileStream = new FileInputStream(FILE_NAME);
            // Creating an object input stream
            ObjectInputStream objStream = new ObjectInputStream(fileStream);

            //Using the readInt() method
            System.out.println("Integer data :" + objStream.readInt());

            // Using the readObject() method
            System.out.println("String data: " + objStream.readObject());

            output.close();
            objStream.close();
        }
        catch (Exception e) {
            e.getStackTrace();
        }
    }
}
