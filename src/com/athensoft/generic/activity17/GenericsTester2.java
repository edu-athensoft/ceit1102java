package com.athensoft.generic.activity17;

/**
 * Activity 17. Bound Types Erasure
 * @author Athens
 *
 */
public class GenericsTester2 {
	public static void main(String[] args) {
		Box2 integerBox = new Box2();
		Box2 doubleBox = new Box2();

		integerBox.add(new Integer(10));
		doubleBox.add(new Double(10.0));

		System.out.printf("Integer Value :%d\n", integerBox.get());
		System.out.printf("Double Value :%s\n", doubleBox.get());
	}
}

class Box2 {
	private Number t;

	public void add(Number t) {
		this.t = t;
	}

	public Number get() {
		return t;
	}
}
