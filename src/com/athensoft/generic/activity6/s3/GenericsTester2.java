package com.athensoft.generic.activity6.s3;

/**
 * Activity 18. Unbounded Types Erasure
 * 
 * @author Athens
 *
 */
public class GenericsTester2 {
	public static void main(String[] args) {
		Box integerBox = new Box();
		Box stringBox = new Box();

		integerBox.add(new Integer(10));
		stringBox.add(new String("Hello World"));

		System.out.printf("Integer Value :%d\n", integerBox.get());
		System.out.printf("String Value :%s\n", stringBox.get());
	}
}

//class Box<T> {
//	private T t;
//
//	public void add(T t) {
//		this.t = t;
//	}
//
//	public T get() {
//		return t;
//	}
//}
