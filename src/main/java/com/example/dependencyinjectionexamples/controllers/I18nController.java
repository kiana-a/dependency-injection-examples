package com.example.dependencyinjectionexamples.controllers;

import com.example.dependencyinjectionexamples.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class I18nController {

    private final GreetingService greetingService;

    public I18nController(@Qualifier("i18nService") GreetingService greetingService){
        this.greetingService = greetingService;
    }

    public String sayHallo(){
        return greetingService.sayGreeting();
    }

}
