package com.athensoft.generic.activity7.s7;

import java.util.List;

public class GenericsTester {
    public static void main(String[] args) {
        //The generic class Box<T> may not subclass java.lang.Throwable
//        class Box<T> extends Exception {}

        //The generic class Box<T> may not subclass java.lang.Throwable
//        class Box1<T> extends Throwable {}

    }


    public static <T extends Exception, J> void execute(List<J> jobs) {
        try {
            for (J job : jobs) {

            }

            // compile-time error
            //Cannot use the type parameter T in a catch block
        }
//        catch (T e) {   //error
//             ...
//        }
        finally{

        }
    }


}

class Box<T extends Exception>  {
    private int t;

    public void add(int t) throws T {
        this.t = t;
    }

    public int get() {
        return t;
    }
}