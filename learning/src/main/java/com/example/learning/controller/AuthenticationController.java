package com.example.learning.controller;


import com.example.learning.dao.UserDao;
import com.example.learning.entity.User;
import com.example.learning.web.support.DefaultResponseWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticationController {
    @Autowired
    private UserDao userDao;

    @GetMapping(path = "/get-user-by-email/{email}")
    public DefaultResponseWrapper<User> getUserByEmail(@PathVariable String email){
        User user = userDao.findByEmail(email);
        return  new DefaultResponseWrapper<>(user);
    }


}
