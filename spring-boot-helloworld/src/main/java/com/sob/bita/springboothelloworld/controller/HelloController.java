package com.sob.bita.springboothelloworld.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/")
    public String index()
    {
        return "hello world";
    }

    private Map<String,Object> result = new HashMap<>();
    @RequestMapping("/hello")
    public Map<String,Object> hello()
    {
        result.put("name","Ahmed");
        result.put("city","Zanzibar");
        return result;
    }

}
