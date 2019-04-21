package com.lll.provider.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TsetController {

    @GetMapping("hello")
    public String hello(){
        return "Hello，我是provider";
    }

    @GetMapping("hi")
    public String hi(){
        return "hi，我是provider";
    }
}
