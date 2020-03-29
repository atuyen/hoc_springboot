package com.example.learning.controller;


import com.example.learning.dao.AccountDao;
import com.example.learning.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TestHibernateController {
    @Autowired
    AccountDao accountDao;


    @GetMapping(path = "/accounts")
    List<Account> getAccounts(){
        return  accountDao.getAccounts();
    }


    @GetMapping(path = "/get-account-by-email")
    Account getAccountByUsername(@RequestParam(name = "userName") String userName){
        return  accountDao.getAccountByUserName(userName);
    }


}
