package com.example.learning.dao;

import com.example.learning.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;


@Transactional
@Repository
public class AccountDao  {

    @PersistenceContext
    EntityManager entityManager;



   public  List<Account> getAccounts(){
        String query = "Select e from Account e";
        List<Account> accounts = entityManager.createQuery(query,Account.class).getResultList();
        return  accounts;

    }


    public Account getAccountByUserName(String userName){
       String query = "Select e from Account e where e.username = '"+userName+"'";
       Account account = entityManager.createQuery(query,Account.class).getSingleResult();
       return  account;
    }

    public void saveAccount(Account account){
       entityManager.persist(account);

    }

}
