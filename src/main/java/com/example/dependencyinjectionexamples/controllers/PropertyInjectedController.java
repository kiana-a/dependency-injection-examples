package com.example.dependencyinjectionexamples.controllers;

import com.example.dependencyinjectionexamples.services.GreetingService;

public class PropertyInjectedController {

    public GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
