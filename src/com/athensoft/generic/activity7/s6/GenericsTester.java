package com.athensoft.generic.activity7.s6;

import java.util.ArrayList;
import java.util.List;

public class GenericsTester {
    public static void main(String[] args) {
        //Cannot create a generic array of Box<Integer>
//        Box<Integer>[] arrayOfLists = new Box<Integer>[2];
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

