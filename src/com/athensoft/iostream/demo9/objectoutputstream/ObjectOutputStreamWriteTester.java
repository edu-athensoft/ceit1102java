package com.athensoft.iostream.demo9.objectoutputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamWriteTester {
	
	public static void main(String[] args) {	
		final String FILE_NAME = ".\\src\\com\\athensoft\\iostream\\demo9\\objectoutputstream\\file-objects.txt";
		
        int data1 = 5;
        String data2 = "This is athensoft open-minded learning";

        try {

            FileOutputStream file = new FileOutputStream(FILE_NAME);

            // Creates an ObjectOutputStream
            ObjectOutputStream output = new ObjectOutputStream(file);

            // writes objects to output stream
            output.writeInt(data1);
            output.writeObject(data2);

            // Reads data using the ObjectInputStream
            FileInputStream fileStream = new FileInputStream(FILE_NAME);
            ObjectInputStream objStream = new ObjectInputStream(fileStream);

            System.out.println("Integer data :" + objStream.readInt());
            System.out.println("String data: " + objStream.readObject());

            output.close();
            objStream.close();
        }

        catch (Exception e) {
            e.getStackTrace();
        }
    }
}
