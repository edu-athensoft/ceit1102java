package com.athensoft.generic.activity5;

/**
 * Activity 5. Multiple Type Parameters
 * 
 * @author Athens
 *
 */
public class GenericsTester {
	public static void main(String[] args) {
		Box<Integer, String> box = new Box<Integer, String>();
		box.add(Integer.valueOf(10), "box");
		System.out.printf("Integer Value :%d\n", box.getFirst());
		System.out.printf("String Value :%s\n", box.getSecond());

		Box<String, String> box1 = new Box<String, String>();
		box1.add("Message", "box1");
		System.out.printf("String Value :%s\n", box1.getFirst());
		System.out.printf("String Value :%s\n", box1.getSecond());
	}
}

class Box<T, S> {
	private T t;
	private S s;

	public void add(T t, S s) {
		this.t = t;
		this.s = s;
	}

	public T getFirst() {
		return t;
	}

	public S getSecond() {
		return s;
	}
}
