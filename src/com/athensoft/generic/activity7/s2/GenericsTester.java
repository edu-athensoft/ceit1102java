package com.athensoft.generic.activity7.s2;

/**
 * Activity 21. No instance
 * 
 * @author Athens
 *
 */
public class GenericsTester {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		Box<String> stringBox = new Box<String>();
		add(stringBox, String.class);
	}

	public static <T> void add(Box<T> box) {
		// compiler error
		// Cannot instantiate the type T
		// T item = new T();
		// box.add(item);
	}

	public static <T> void add(Box<T> box, Class<T> clazz) throws InstantiationException, IllegalAccessException {
		T item = clazz.newInstance(); // OK
		box.add(item);
		System.out.println("Item added.");
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
