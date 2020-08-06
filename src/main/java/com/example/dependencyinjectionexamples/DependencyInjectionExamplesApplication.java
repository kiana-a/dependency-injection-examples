package com.example.dependencyinjectionexamples;

import com.example.dependencyinjectionexamples.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionExamplesApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(DependencyInjectionExamplesApplication.class, args);

        MyController myController = (MyController) context.getBean("myController");

        String greeting = myController.sayHello();

        System.out.println(greeting);

    }

}
