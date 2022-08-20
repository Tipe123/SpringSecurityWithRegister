package com.spring.security.tutorial.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello, this is Tipe's registration process";
    }
}
