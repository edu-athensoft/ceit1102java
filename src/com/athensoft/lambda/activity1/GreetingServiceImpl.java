package com.athensoft.lambda.activity1;

public class GreetingServiceImpl implements GreetingService{
    @Override
    public void sayMessage(String message) {
        System.out.println("Hello " + message);
    }
}
