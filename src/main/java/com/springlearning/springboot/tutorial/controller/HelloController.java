package com.springlearning.springboot.tutorial.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
//    @RequestMapping(value="/",method= RequestMethod.GET)
    @GetMapping(value="/") //You can add value as a kw
    public String helloWorld() {
        return "Welcome  to my first rest api";
    }
}
