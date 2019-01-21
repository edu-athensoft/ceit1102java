package com.athensoft.lambda.activity1;

public class MainApp {
    public static void main(String[] args) {
        GreetingService greetService1 = new GreetingServiceImpl();
        GreetingService greetService2 = new GreetingServiceImpl2();

        greetService1.sayMessage("Mahesh");
        greetService2.sayMessage("Suresh");
    }
}
