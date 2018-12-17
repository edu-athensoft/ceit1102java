package com.athensoft.generic.activity7.s5;

public class GenericsTester {
    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<Integer>();

    //Compiler Error:
    //Cannot perform instanceof check against
    //parameterized type Box<Integer>.
    //Use the form Box<?> instead since further
    //generic type information will be erased at runtime

        //if(integerBox instanceof Box<Integer>) { }
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
