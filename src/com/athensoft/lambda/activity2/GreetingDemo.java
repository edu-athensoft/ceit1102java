package com.athensoft.lambda.activity2;

public class GreetingDemo {
    public static void main(String[] args) {
        //without parenthesis
        GreetingService greetService1 = message -> System.out.println("Hello " + message);

        //with parenthesis
        GreetingService greetService2 = (message) -> System.out.println("Hi " + message);

        greetService1.sayMessage("Mahesh");
        greetService2.sayMessage("Suresh");
    }

}

