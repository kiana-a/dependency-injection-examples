package com.example.dependencyinjectionexamples.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello Dependency Injection";
    }
}
