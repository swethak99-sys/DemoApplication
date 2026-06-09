package com.example.demo.controller;

import com.example.demo.request.DemoRequest;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
//@RequestMapping("/demo")
public class DemoController {

    @Value("${api.greetings}")
    private String greetings;

    @GetMapping(value = "greetings")
    public String greetings(@RequestHeader(value = "Name") String name)
    {
        return greetings+name;
    }
    @PostMapping(value = "greetings")
    public String postGreetings(@RequestBody DemoRequest demoRequest)
    {
        return "Hello "+demoRequest.getName();

    }
}
