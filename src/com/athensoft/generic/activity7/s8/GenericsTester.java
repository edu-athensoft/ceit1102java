package com.athensoft.generic.activity7.s8;

import java.util.List;

/**
 * Activity 7-8. No overloaded
 */
public class GenericsTester {
    public static void main(String[] args) {

    }

    //Compiler error
    //Erasure of method print(List<String>)
    //is the same as another method in type Box

//    public void print(List<String> stringList) { }
//    public void print(List<Integer> integerList) { }

    public <T extends String,Number> void print(List<T> myList) {
        for(T em: myList){
            System.out.println(em);
        }

    }

}
