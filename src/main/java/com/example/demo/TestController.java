package com.example.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping


public class TestController {
    @GetMapping("/test")
    public String returnphrase() {
        return "hello";
    }
}
