package com.faraonelife.sfgdi.Controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    public String sayHello(){
        System.out.println("hello world");
        return "hi Folks";
    }
}
