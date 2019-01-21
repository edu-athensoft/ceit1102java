package com.athensoft.lambda.activity5;

import java.util.Comparator;

public class LambdaDemo {
    public static void main(String[] args) {

        //anonymous class
        Foo foo1 = new Foo(){
          public void method1(int a, int b){
              System.out.println("hello");
          }
        };


        //only one single method
        Foo foo = (a,b)-> System.out.println(a+b);
        foo.method1(1,2);
    }


}

interface Foo{
    void method1(int a, int b);
}
