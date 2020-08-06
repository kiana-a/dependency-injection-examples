package com.example.dependencyinjectionexamples;

import com.example.dependencyinjectionexamples.controllers.ConstructorInjectedController;
import com.example.dependencyinjectionexamples.controllers.MyController;
import com.example.dependencyinjectionexamples.controllers.PropertyInjectedController;
import com.example.dependencyinjectionexamples.controllers.SetterInjectedController;
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

        System.out.println("\n******* prperty : \n");
        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) context.getBean("propertyInjectedController");
        System.out.println(propertyInjectedController.getGreeting());

        System.out.println("\n******* setter : \n");
        SetterInjectedController setterInjectedController = (SetterInjectedController) context.getBean("setterInjectedController");
        System.out.println(setterInjectedController.getGreeting());

        System.out.println("\n****** constructor : \n");
        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) context.getBean("constructorInjectedController");
        System.out.println(constructorInjectedController.getGreeting());

    }

}
