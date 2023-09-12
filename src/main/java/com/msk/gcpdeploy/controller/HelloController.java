package com.msk.gcpdeploy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/app/hello")
    public String helloWorld(){
        return "Hello World";
    }
}
