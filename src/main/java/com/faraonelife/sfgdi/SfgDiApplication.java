package com.faraonelife.sfgdi;

import com.faraonelife.sfgdi.Controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.lang.invoke.ConstantBootstraps;

@SpringBootApplication
public class SfgDiApplication {

    public static void main(String[] args) {
       ApplicationContext ctx= SpringApplication.run(SfgDiApplication.class, args);
        MyController myController=(MyController) ctx.getBean("myController");
        System.out.println("----I18N ");
        I18nController i18nController=(I18nController)ctx.getBean("i18nController");
        System.out.println(i18nController.sayHello());

        System.out.println("----Primary bean");
        System.out.println(myController.sayHello());


        System.out.println("-----property");
        PropertyInjectionController propertyInjectionController=(PropertyInjectionController) ctx.getBean("propertyInjectionController");
        System.out.println(propertyInjectionController.getGreeting());

        System.out.println("-----Setter");
        SetterInjaectedController setterInjaectedController=(SetterInjaectedController) ctx.getBean("setterInjaectedController");
        System.out.println(setterInjaectedController.getGreeting());

                System.out.println("-----Constructor");
        ConstructorInjectorController constructorInjectorController=(ConstructorInjectorController) ctx.getBean("constructorInjectorController");
        System.out.println(constructorInjectorController.getGreeting());


    }

}
