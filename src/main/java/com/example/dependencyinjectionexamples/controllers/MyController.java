package com.example.dependencyinjectionexamples.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String sayHello(){
        System.out.println("Hello DI world.");

        return "greetings";
    }
}
