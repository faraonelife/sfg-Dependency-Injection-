
package com.faraonelife.sfgdi.services;

import com.faraonelife.sfgdi.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
@Profile("En")
@Service("i18nService")

public class I18nEnglishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "hello world -EN";
    }
}
