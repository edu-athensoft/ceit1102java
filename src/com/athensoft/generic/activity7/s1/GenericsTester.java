package com.athensoft.generic.activity7.s1;

/**
 * Activity 20. No primitive types
 * @author Athens
 *
 */
public class GenericsTester {
	public static void main(String[] args) {
	      Box<Integer> integerBox = new Box<Integer>();

	      //compiler errror
	      //ReferenceType
	      //- Syntax error, insert "Dimensions" to complete ReferenceType
	      //Box<int> stringBox = new Box<int>();

	      integerBox.add(new Integer(10));
	      printBox(integerBox);
	   }

	private static void printBox(Box box) {
		System.out.println("Value: " + box.get());
	}
}

class Box<T> {
	private T t;

	public void add(T t) {
		this.t = t;
	}

	public T get() {
		return t;
	}
}
