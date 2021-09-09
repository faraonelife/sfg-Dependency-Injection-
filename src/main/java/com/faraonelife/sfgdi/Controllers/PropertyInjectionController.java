package com.faraonelife.sfgdi.Controllers;

import com.faraonelife.sfgdi.services.GreetingService;
import com.faraonelife.sfgdi.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectionController {
   @Autowired
    public GreetingService greetingService;
    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
