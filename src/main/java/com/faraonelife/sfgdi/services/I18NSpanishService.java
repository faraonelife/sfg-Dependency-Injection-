package com.faraonelife.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
@Profile({"Es","default"})
@Service("i18nService")
public class I18NSpanishService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Holla mondo-ES";
    }
}
