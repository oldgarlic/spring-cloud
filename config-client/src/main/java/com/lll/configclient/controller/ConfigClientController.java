package com.lll.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigClientController {

    @Value("${people.name}")
    String name;

    @GetMapping("1")
    public String configClientTest(){
        return name;
    }
}
