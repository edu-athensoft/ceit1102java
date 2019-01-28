package com.athensoft.lambda.activity6;

import java.io.OutputStream;

public class LambdaDemo {
    public static void main(String[] args) {
        MyInterface myInterface = (String text) ->  System.out.print(text);

        myInterface.printIt("hello");

//       myInterface.printUtf8To("hello-win", System.out);
    }
}
