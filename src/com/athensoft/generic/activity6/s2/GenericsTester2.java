package com.athensoft.generic.activity6.s2;

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

class Box2<T> {
	private T t;

	public void add(T t) {
		this.t = t;
	}

	public T get() {
		return t;
	}
}


/*

class Box {
   private Object t;

   public void add(Object t) {
      this.t = t;
   }

   public Object get() {
      return t;
   }
}
 */