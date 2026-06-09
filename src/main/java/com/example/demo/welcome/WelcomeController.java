package com.example.demo.welcome;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.naming.Name;

@RestController
@RequestMapping("/greetings")
public class WelcomeController {
    @GetMapping(value ="Welcome")
    public String Welcome(@RequestHeader(value = "Name") String name){
        return "Welcome "+ name;
    }

}
