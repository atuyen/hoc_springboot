package com.example.learning.controller;


import com.example.learning.entity.Personal;
import com.example.learning.web.support.DefaultResponseWrapper;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(path = "/personal")
public class PersonalController {


    //===>url = localhost:8081/personal/get-by-id/18?fullName=nguyentuyen&age=30&name=tuyen
    @GetMapping(path = "/get-by-id/{id}")
    Personal getPersonal(@PathVariable String id,
                         @RequestParam String name,
                         @RequestParam(name = "fullName",required = false,defaultValue = "phong") String fullName ,
                         @RequestParam(name = "age",required = false,defaultValue = "18") int age){

        name+=" "+fullName+" "+age;
        return new Personal(id,name);
    }


    //==>url = localhost:8081/personal/add-personal/123?comment=hello
    //body = {
    //  "id":"1",
    //  "name": "tuyen"
    // }
    @PostMapping(path = "/add-personal/{authorId}")
    DefaultResponseWrapper<Personal> addPersonal(@RequestBody Personal personal,
                                       @RequestParam(name = "comment",required = false) String comment){
        personal.setName(personal.getName()+ " "+comment);
        return new DefaultResponseWrapper<Personal>(personal);

    }


}




