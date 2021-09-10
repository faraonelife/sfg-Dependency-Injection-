package com.faraonelife.sfgdi.Controllers;

import com.faraonelife.sfgdi.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjaectedControllerTest {
SetterInjaectedController setterInjaectedController;

    @BeforeEach
    void setUp() {
        setterInjaectedController=new SetterInjaectedController();
        setterInjaectedController.setGreetingService(new ConstructorGreetingService());
    }

    @Test
    void getGreeting() {
        System.out.println(setterInjaectedController.getGreeting());
    }
}