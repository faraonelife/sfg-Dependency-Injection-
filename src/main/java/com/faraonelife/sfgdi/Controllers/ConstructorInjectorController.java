package com.faraonelife.sfgdi.Controllers;

import com.faraonelife.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectorController {
    private  final GreetingService greetingService;

    public ConstructorInjectorController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
