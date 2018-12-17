package com.athensoft.generic.activity7.s3;

/**
 * Activity 22. No Static field
 * 
 * @author Athens
 *
 */
public class GenericsTester {
	public static void main(String[] args) {
		Box<Integer> integerBox = new Box<Integer>();
		Box<String> stringBox = new Box<String>();

		integerBox.add(new Integer(10));
		printBox(integerBox);
	}

	private static void printBox(Box box) {
		//System.out.println("Value: " + box.get());
	}
}

class Box<T> {
	// compiler error
	
//	private static T t;
//
	private T t;
	public void add(T t) {
		//this.t = t;
	}
//
	public T get() {
		return t;
	}
}