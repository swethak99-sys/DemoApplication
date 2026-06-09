package com.example.demo.addition;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/math")
public class AdditionController {
    @GetMapping(value = "addition")
    public int addition(@RequestHeader(value = "number1") Integer a, @RequestHeader(value = "number2") Integer b) {
        return a+b;

    }
    @GetMapping(value = "add")
    public int addition(@RequestHeader(value = "number1") String a, @RequestHeader(value = "number2") String b) {
        int num = Integer.parseInt(a);
        int num1 = Integer.parseInt(b);
        return num + num1;

    }
    @GetMapping(value = "sub")
    public int sub(@RequestHeader(value = "number1") Integer a, @RequestHeader(value = "number2") Integer b) {
        return a-b;

    }
}
