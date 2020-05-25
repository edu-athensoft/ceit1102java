package com.athensoft.iostream.demo8.objectinputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjectInputStreamrReadObjectTester {
	public static void main(String[] args) {
		
		final String FILE_NAME = ".\\src\\com\\athensoft\\iostream\\demo8\\objectinputstream\\file-objects-2.txt";
		
        // Creates an object of Dog class
        Dog dog = new Dog("Peter", "Trump");

        try {
            FileOutputStream file = new FileOutputStream(FILE_NAME);

            // Creates an ObjectOutputStream
            ObjectOutputStream output = new ObjectOutputStream(file);

            // Writes objects to the output stream
            output.writeObject(dog);

            FileInputStream fileStream = new FileInputStream(FILE_NAME);

            // Creates an ObjectInputStream
            ObjectInputStream input = new ObjectInputStream(fileStream);

            // Reads the objects
            Dog newDog = (Dog) input.readObject();

            System.out.println("Dog Name: " + newDog.name);
            System.out.println("Dog Breed: " + newDog.breed);

            output.close();
            input.close();
        }

        catch (Exception e) {
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

