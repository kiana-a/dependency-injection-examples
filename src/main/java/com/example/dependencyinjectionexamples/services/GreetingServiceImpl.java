package com.example.dependencyinjectionexamples.services;

public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World : (greeting service imp)";
    }
}
