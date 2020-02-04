package com.example.learning.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HocRoute {
    //Muc co ban nhat ===> api localhost:8080/api
    @RequestMapping("/")
    String home() {
        return "Muc co ban nhat";
    }


    //Muc co ban 2 ===> api localhost:8080/api/simpleapi
    @RequestMapping("/simple")
    String simple() {
        return "Muc co ban 2";
    }
}

