package com.athensoft.lambda.activity4;

public class LambaApp2 {
    public static void main(String[] args) {
        //with type declaration
        MathOperation addition = (int a, int b) -> a + b;

        //with out type declaration
        MathOperation subtraction = (a, b) -> a - b;

        //with return statement along with curly braces
        MathOperation multiplication = (int a, int b) -> { return a * b; };

        //without return statement and without curly braces
        MathOperation division = (int a, int b) -> a / b;


        /*
           refactor, replacing the following with a unique method
           we want to pass the whole implementation as a calculating unit by a 'function' name
         */

//        int a = addition.operation(10,5);
//        int s = subtraction.operation(10,5);
//        int m = multiplication.operation(10,5);
//        int d = division.operation(10,5);

        int a = calculate(10,5,addition);
        int s = calculate(10,5,subtraction);
        int m = calculate(10,5,multiplication);
        int d = calculate(10,5,division);

        System.out.println("10+5="+a);
        System.out.println("10-5="+s);
        System.out.println("10x5="+m);
        System.out.println("10/5="+d);
    }

    private static int calculate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operation(a,b);
    }


    interface MathOperation {
        int operation(int a, int b);
    }
}
