package com.athensoft.generic.activity7.s4;

/**
 * Activity 7-4. No cast
 */
public class GenericsTester {
    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<Integer>();
        Box<Number> numberBox = new Box<Number>();
        //Compiler Error: Cannot cast from Box<Number> to Box<Integer>
        //integerBox = (Box<Integer>)numberBox;
    }

    private static void add(Box<?> box) {
        Box<Integer> integerBox = (Box<Integer>)box;
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
