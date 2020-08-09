package com.example.dependencyinjectionexamples;

import com.example.dependencyinjectionexamples.controllers.*;
import com.example.dependencyinjectionexamples.services.LifeCycleDemoBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionExamplesApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(DependencyInjectionExamplesApplication.class, args);

        I18nController i18nController = (I18nController) context.getBean("i18nController");
        System.out.println(i18nController.sayHallo());

        LifeCycleDemoBean lifeCycleDemoBean = (LifeCycleDemoBean) context.getBean("lifeCycleDemoBean");
        System.out.println(lifeCycleDemoBean);

        MyController myController = (MyController) context.getBean("myController");

        System.out.println("------- Primary Bean");
        System.out.println(myController.sayHello());

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
