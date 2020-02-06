package com.example.controlller2;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompanyController {
    //Muc co ban nhat ===> api localhost:8080/api/bongda
    @RequestMapping("/bongda")
    String simple() {
        return "Toi yeu bong da ";
    }

}
