package com.example.learning.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(path = "/v1")
@RestController
public class HocRoute2 {
    //Muc co ban nhat ===> api localhost:8080/v1/
    @RequestMapping("/")
    String home() {
        return "Muc co ban nhat cua v1";
    }

    //Muc co ban nhat ===> api localhost:8080/v1/simple
    @RequestMapping("/simple")
    String simple() {
        return "Muc simple cua v1";
    }
}
