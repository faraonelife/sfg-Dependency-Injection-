package com.faraonelife.sfgdi.Controllers;

import com.faraonelife.sfgdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropertyInjectionControllerTest {
PropertyInjectionController controller;

    @BeforeEach
    void setUp() {
        controller= new PropertyInjectionController();
        controller.greetingService=new GreetingServiceImpl();

    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}