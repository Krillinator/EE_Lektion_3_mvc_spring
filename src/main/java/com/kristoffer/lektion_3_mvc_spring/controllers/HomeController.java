package com.kristoffer.lektion_3_mvc_spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

// @RestController // WS (web services)
@Controller
public class HomeController {

    @GetMapping
    public String test() {

        return "myTest.html";
    }

    @GetMapping("/hello")
    public String sayHello() {

        return "sayHello.html";
    }

}

