package com.helloliu.live.controller;

import com.helloliu.live.domain.Test;
import com.helloliu.live.service.TestService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class TestController {

    @Value("${test.hello:Test}")
    private String testHello;

    @Resource
    private TestService testService;

    @RequestMapping("/hello")
    public String hello(){
        return "hello world" + testHello;
    }

    @GetMapping("/test/list")
    public List<Test> list(){
        return testService.list();
    }
}
