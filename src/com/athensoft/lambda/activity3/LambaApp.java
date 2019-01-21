package com.athensoft.lambda.activity3;

public class LambaApp {
    public static void main(String[] args) {
        //with type declaration
        MathOperation addition = (int a, int b) -> a + b;

        //with out type declaration
        MathOperation subtraction = (a, b) -> a - b;

        //with return statement along with curly braces
        MathOperation multiplication = (int a, int b) -> { return a * b; };

        //without return statement and without curly braces
        MathOperation division = (int a, int b) -> a / b;


        int a = addition.operation(10,5);
        int s = subtraction.operation(10,5);
        int m = multiplication.operation(10,5);
        int d = division.operation(10,5);

        System.out.println("10+5="+a);
        System.out.println("10-5="+s);
        System.out.println("10x5="+m);
        System.out.println("10/5="+d);
    }

    interface MathOperation {
        int operation(int a, int b);
    }
}
