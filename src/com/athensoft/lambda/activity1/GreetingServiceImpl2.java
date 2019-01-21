package com.athensoft.lambda.activity1;

public class GreetingServiceImpl2 implements GreetingService{
    @Override
    public void sayMessage(String message) {
        System.out.println("Hi " + message);
    }
}
