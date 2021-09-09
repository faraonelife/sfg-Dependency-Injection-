package com.faraonelife.sfgdi.Controllers;

import com.faraonelife.sfgdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetterInjaectedControllerTest {
SetterInjaectedController setterInjaectedController;

    @BeforeEach
    void setUp() {
        setterInjaectedController=new SetterInjaectedController();
        setterInjaectedController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    void getGreeting() {
        System.out.println(setterInjaectedController.getGreeting());
    }
}