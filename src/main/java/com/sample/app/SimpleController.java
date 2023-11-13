package com.sample.app;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

    @RequestMapping("/hello")
    public String getWelcomeMessage() {

        return "Hello World...!!!";
    }
}
