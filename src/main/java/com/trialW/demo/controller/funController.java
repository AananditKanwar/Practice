package com.trialW.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class funController {

    @Value("${coach.name}")
    String coachName;

    @Value("${team.name}")
    String teamName;

    // expose "/" that returns "Hello World"
    @GetMapping("/")
    public String func() {
        return "Sample endpoint";
    }

    @GetMapping("/test")
    public String func1() {
        return coachName + " " + teamName;
    }

    @GetMapping("/workout")
    public String func3() {
        return "checker 23";
    }
}
