package com.helloliu.live.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("${test.hello:Test}")
    private String testHello;

    @RequestMapping("/hello")
    public String hello(){
        return "hello world" + testHello;
    }
}
