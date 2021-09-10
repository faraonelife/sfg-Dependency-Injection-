package com.faraonelife.sfgdi.Controllers;

import com.faraonelife.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectionController {
    @Qualifier("propertyInjectedGreetingService")
   @Autowired
    public GreetingService greetingService;
    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
