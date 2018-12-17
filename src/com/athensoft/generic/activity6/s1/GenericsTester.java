package com.athensoft.generic.activity6.s1;

/**
 * Activity 17. Bound Types Erasure
 * @author Athens
 *
 */
public class GenericsTester {
	public static void main(String[] args) {
		Box<Integer> integerBox = new Box<Integer>();
		Box<Double> doubleBox = new Box<Double>();

		integerBox.add(new Integer(10));
		doubleBox.add(new Double(10.0));

		System.out.printf("Integer Value :%d\n", integerBox.get());
		System.out.printf("Double Value :%s\n", doubleBox.get());
	}
}

class Box<T extends Number> {
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
   private Number t;

   public void add(Number t) {
      this.t = t;
   }

   public Number get() {
      return t;
   }
}




 */