package com.example.learning.dao;

import com.example.learning.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.List;


@Repository
public class AccountDao {

    @PersistenceContext
    EntityManager entityManager;



   public  List<Account> getAccounts(){

        String query = "Select e from Account e";
        List<Account> accounts = entityManager.createQuery(query,Account.class).getResultList();
        return  accounts;

    }


}
