package com.example.learning.dao;

import com.example.learning.entity.Account;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
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


    public  Account getAccountById(){
       Account account = entityManager.find(Account.class,1l);
       return  account;
    }

    public  Account addNewAccount(){
       Account account = Account.builder()
               .username("tuyen")
               .password("123")
               .build();
       entityManager.persist(account);
       return  account;
    }

    public Account updateAccount(){
       Account account = entityManager.find(Account.class,1l);
       account.setUsername("Tuyen update");
       entityManager.merge(account);
       return  account;
    }

    public void deleteAccount(){
        Account account = entityManager.find(Account.class,2l);
        entityManager.remove(account);

    }




    public void saveAccount(Account account){
       entityManager.persist(account);

    }

}
