package com.learn.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping("/")
    public String welcome1() {
        return "Welcome!!";
    }

    @GetMapping("/public/welcome")
    public String welcome() {
        return "Welcome to Spring Security 6 learning!!";
    }

    @GetMapping("/public/welcome/{name}")
    public String welcome(@PathVariable String name) {
        return "Welcome " + name + " to Spring Security 6 learning!!";
    }
}
