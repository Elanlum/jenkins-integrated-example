package com.example.jenkinsintegratedexample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping
    public String get() {
        String a = "aaa";
        method(a);
        return "Pong!";
    }

    private void method(String s) {
        System.out.println(s);
    }
}
