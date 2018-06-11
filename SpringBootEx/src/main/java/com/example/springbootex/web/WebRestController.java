package com.example.springbootex.web;

@RestController
public class WebRestController{
    @GetMapping("/hello")
    public String hello(){
        return "HelloWorld";
    }
}