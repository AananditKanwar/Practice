package com.trialW.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// expose an endpoint that writes Hello World

@RestController
public class FunRestController {

    // expose "/" that returns "Hello World"

    @GetMapping("/")
    public String sayHello() {
        return "Hello My First Rest Applet";
    }
}
