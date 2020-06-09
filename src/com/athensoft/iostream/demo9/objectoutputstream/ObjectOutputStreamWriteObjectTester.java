package com.athensoft.iostream.demo9.objectoutputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjectOutputStreamWriteObjectTester {
	public static void main(String[] args) {
		
		final String FILE_NAME = ".\\src\\com\\athensoft\\iostream\\demo9\\objectoutputstream\\file-objects-2.txt";
		
		// Creates an object of Dog class
		Dog dog1 = new Dog("Peter", "Husky");

		try {
			FileOutputStream fileOut = new FileOutputStream(FILE_NAME);

			// Creates an ObjectOutputStream
			ObjectOutputStream objOut = new ObjectOutputStream(fileOut);

			// Writes objects to the output stream
			objOut.writeObject(dog1);

			// Reads the object
			FileInputStream fileIn = new FileInputStream(FILE_NAME);
			ObjectInputStream objIn = new ObjectInputStream(fileIn);

			// Reads the objects
			Dog newDog = (Dog) objIn.readObject();

			System.out.println("Dog Name: " + newDog.name);
			System.out.println("Dog Breed: " + newDog.breed);

			objOut.close();
			objIn.close();
		} catch (Exception e) {
			e.getStackTrace();
		}
	}
}

class Dog implements Serializable {

    String name;
    String breed;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }
}
